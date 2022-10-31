package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Kodlama.io.Devs.entities.concretes.Language;
@Repository
public class InMemoryLanguageRepository implements LanguageRepository {
	List<Language> languages;
	public InMemoryLanguageRepository() {
		languages = new ArrayList<Language>();
		languages.add(new Language(1, "C#"));
		languages.add(new Language(2, "Phyton"));
		languages.add(new Language(3, "Java"));
	}
	
	

	@Override
	public List<Language> getAll() {
		
		return languages;
	}

	@Override
	public List<Language> getById(int id) {
		for(Language language : languages) {
			if(language.getId() == id) {
				return languages;
			}
				
			
		}
		return languages;

	}

	@Override
	public void add(Language language) {
		languages.add(language);
		
	}

	@Override
	public void delete(int id) {
		for(Language language : languages) {
			if(language.getId() == id) {
				languages.remove(language);
			}
				
			
		}
		
	}

	@Override
	public void update(int id,String newName) {
		for(Language language : languages) {
			if(language.getId() == id) {
				language.setName(newName);
			}
				
			
		}	
		
	}

}
