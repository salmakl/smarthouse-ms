package ma.youcode.history.service.interfaces;

import ma.youcode.history.model.History;

import java.util.List;

public interface CrudService {
    History add(History history);
    boolean remove(Long historyId);
    History getById(Long historyId);
    List<History> getAll();
}
