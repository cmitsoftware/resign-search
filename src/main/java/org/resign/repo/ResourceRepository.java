package org.resign.repo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(collectionResourceRel = "resource", path = "resource")
public interface ResourceRepository extends MongoRepository<Resource, String> {

	@Query(value = "{ $or:["
			+ "{'name': {$regex : ?0, $options: 'i'}},"
			+ "{'surname': {$regex : ?0, $options: 'i'}},"
			+ "{'desc': {$regex : ?0, $options: 'i'}},"
			+ "{'tags.name': {$regex : ?0, $options: 'i'}},"
			+ "{'tags.id': ?1}"
			+ "] }")
	public Page<Resource> searchFullTextOrByTag(@Param("search") String search, @Param("tagId") String tagId, Pageable pageable);
	
	@Query(value = "{ $or:["
			+ "{'name': {$regex : ?0, $options: 'i'}},"
			+ "{'surname': {$regex : ?0, $options: 'i'}},"
			+ "{'desc': {$regex : ?0, $options: 'i'}}"
			+ "] }")
	public Page<Resource> searchFullText(@Param("name") String name, Pageable pageable);
    
   /*
    * Prevents POST /people and PATCH/PUT /resource/:id(non-Javadoc)
    * @see org.springframework.data.repository.CrudRepository#save(S)
    */
    @SuppressWarnings("unchecked")
	@Override
    @RestResource(exported = false)
    public Resource save(Resource r);

    /*
     * Prevents DELETE /resource/:id(non-Javadoc)
     * @see org.springframework.data.repository.CrudRepository#delete(java.lang.Object)
     */
    @Override
    @RestResource(exported = false)
    public void delete(Resource r);
	
}