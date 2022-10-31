package kodlama.io.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;
@Service
public class LanguageManager implements LanguageService {
	private LanguageRepository languageRepository;
	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
	
	
	
	
	@Override
	public List<Language> getAll() {
		
		return languageRepository.getAll();
	}




	@Override
	public void add(Language language) {
		
		
	}




	@Override
	public void delete(int id) {
		
		
	}




	@Override
	public void update(int id) {
		
		
	}


	@Override
	public List<Language> getById() {
		
		return null;
	}




	@Override
	public Object getById(int id) {
		
		return null;
	}




	




	




	

}
