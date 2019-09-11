package persistCustomerForm;


import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<CustomerPersist, Long> {

    List<CustomerPersist> findByLastName(String lastName);

}
