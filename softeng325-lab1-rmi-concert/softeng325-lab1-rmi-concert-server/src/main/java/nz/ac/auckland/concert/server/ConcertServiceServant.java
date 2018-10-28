package nz.ac.auckland.concert.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import nz.ac.auckland.concert.common.Concert;
import nz.ac.auckland.concert.common.ConcertService;

public class ConcertServiceServant extends UnicastRemoteObject implements ConcertService {

	protected ConcertServiceServant(int port) throws RemoteException {
		super(port);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Concert createConcert(Concert concert) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Concert getConcert(Long id) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateConcert(Concert concert) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteConcert(Long id) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Concert> getAllConcerts() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clear() throws RemoteException {
		// TODO Auto-generated method stub
		
	}

}
