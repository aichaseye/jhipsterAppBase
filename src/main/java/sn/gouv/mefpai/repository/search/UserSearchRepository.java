package sn.gouv.mefpai.repository.search;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import sn.gouv.mefpai.domain.User;

/**
 * Spring Data Elasticsearch repository for the User entity.
 */
public interface UserSearchRepository extends ElasticsearchRepository<User, Long> {}
