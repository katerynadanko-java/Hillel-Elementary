package lesson9.service;

import lesson9.dao.StatusDao;
import lesson9.dao.StatusDaoImpl;
import lesson9.model.Status;
import org.apache.log4j.Logger;

public class StatusServiceImpl implements StatusService {
    Logger logger = Logger.getLogger(StatusServiceImpl.class);

    @Override
    public void save(Status status) {
        logger.debug(String.format("status. save {id = %d, alias = %s}", status.getId(), status.getAlias()));
        StatusDao statusDao = new StatusDaoImpl();
        statusDao.save(status);
    }

    @Override
    public void update(Status status) {
        logger.debug(String.format("status. update {id = %d, alias = %s}", status.getId(), status.getAlias()));
        StatusDao statusDao = new StatusDaoImpl();
        statusDao.update(status);
    }

    @Override
    public void delete(Status status) {
        logger.debug(String.format("status. delete {id = %d, alias = %s}", status.getId(), status.getAlias()));
        StatusDao statusDao = new StatusDaoImpl();
        statusDao.delete(status);
    }

    @Override
    public Status getById(int id) {
        logger.debug(String.format("status. getById {id = %d}", id));
        StatusDao statusDao = new StatusDaoImpl();
        return statusDao.getById(id);
    }
}
