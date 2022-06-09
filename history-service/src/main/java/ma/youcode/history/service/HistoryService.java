package ma.youcode.history.service;

import lombok.RequiredArgsConstructor;
import ma.youcode.history.model.History;
import ma.youcode.history.repository.HistoryRepository;
import ma.youcode.history.service.interfaces.CrudService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HistoryService implements CrudService {

    private final HistoryRepository historyRepository;

    @Override
    public History add(History history) {
        return this.historyRepository.save(history);
    }

    @Override
    public boolean remove(Long historyId) {
        if(this.getById(historyId) != null) {
            this.historyRepository.deleteById(historyId);
            return true;
        }
        return false;
    }

    @Override
    public History getById(Long historyId) {
        return this.historyRepository.findById(historyId).get();
    }

    @Override
    public List<History> getAll() {
        return this.historyRepository.findAll();
    }
}
