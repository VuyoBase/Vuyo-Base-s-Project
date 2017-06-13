package API.SERVICES;

import API.DTO.Sales;
import CustomExceptions.*;

public interface SalesService {

	public void CreateSales();

	public Sales ReadStock(Sales sales)
			throws AlreadyExistsException, InvalidParametersException, MissingParametersException, NotFoundException;

	public Sales UpdateStock(Sales sales)
			throws AlreadyExistsException, InvalidParametersException, MissingParametersException, NotFoundException;

	public Sales DeleteStock(Integer salesId)
			throws AlreadyExistsException, InvalidParametersException, MissingParametersException, NotFoundException;

	public Sales RecordSales(Sales sales, Integer PrincipalId)
			throws AlreadyExistsException, InvalidParametersException, MissingParametersException, NotFoundException;

	public Sales Voidsales(Sales sales, Integer UserId)
			throws AlreadyExistsException, InvalidParametersException, MissingParametersException, NotFoundException;

	public Sales ReturnSales(Sales sales, Integer Id)
			throws AlreadyExistsException, InvalidParametersException, MissingParametersException, NotFoundException;

	public Sales Viewreport()
			throws AlreadyExistsException, InvalidParametersException, MissingParametersException, NotFoundException;

	public Sales GetAllSales(Integer StartPoint, Integer NumberOfRecords)
			throws AlreadyExistsException, InvalidParametersException, MissingParametersException, NotFoundException;

}
