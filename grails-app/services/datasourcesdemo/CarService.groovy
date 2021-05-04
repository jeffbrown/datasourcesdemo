package datasourcesdemo

import grails.gorm.services.Service
import grails.gorm.transactions.Transactional

@Service(Car)
@Transactional(connection='cars')
interface CarService {

    Car get(Serializable id)

    List<Car> list(Map args)

    Long count()

    void delete(Serializable id)

    Car save(Car car)

}