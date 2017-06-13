package API.SERVICES;

import API.DTO.Stock;
import CustomExceptions.AlreadyExistsException;
import CustomExceptions.InvalidParametersException;
import CustomExceptions.MissingParametersException;
import CustomExceptions.NotFoundException;

public interface StockService {

	public void CreateStock()
			throws AlreadyExistsException, InvalidParametersException, MissingParametersException, NotFoundException;

	public Stock ReadStock(Stock stock)
			throws AlreadyExistsException, InvalidParametersException, MissingParametersException, NotFoundException;

	public Stock UpdateStock(Stock stock)
			throws AlreadyExistsException, InvalidParametersException, MissingParametersException, NotFoundException;

	public Stock DeleteStock(Stock stock)
			throws AlreadyExistsException, InvalidParametersException, MissingParametersException, NotFoundException;

	public Stock AcceptStock(Stock stock)
			throws AlreadyExistsException, InvalidParametersException, MissingParametersException, NotFoundException;

	public Stock TransferStock(Stock stock)
			throws AlreadyExistsException, InvalidParametersException, MissingParametersException, NotFoundException;

	public Stock AdjustStock(Stock stock)
			throws AlreadyExistsException, InvalidParametersException, MissingParametersException, NotFoundException;

	public Stock ReceiveStock(Stock stock)
			throws AlreadyExistsException, InvalidParametersException, MissingParametersException, NotFoundException;

}
