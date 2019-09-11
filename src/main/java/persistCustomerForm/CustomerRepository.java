package persistCustomerForm;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface CustomerRepository extends CrudRepository<CustomerPersist, Long> {

    List<CustomerPersist> findByLastName(String lastName);

}
