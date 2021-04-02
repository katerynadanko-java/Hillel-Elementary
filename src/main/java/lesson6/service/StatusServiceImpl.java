package lesson6.service;

import lesson6.dao.StatusDao;
import lesson6.dao.StatusDaoImpl;
import lesson6.model.Status;

public class StatusServiceImpl implements StatusService {
    @Override
    public void save(Status status) {
        StatusDao statusDao = new StatusDaoImpl();
        statusDao.save(status);
    }

    @Override
    public void update(Status status) {
        StatusDao statusDao = new StatusDaoImpl();
        statusDao.update(status);
    }

    @Override
    public void delete(Status status) {
        StatusDao statusDao = new StatusDaoImpl();
        statusDao.delete(status);
    }

    @Override
    public Status getById(int id) {
        StatusDao statusDao = new StatusDaoImpl();
        return statusDao.getById(id);
    }
}