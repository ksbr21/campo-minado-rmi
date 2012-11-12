package srvcampominado;

import java.rmi.RemoteException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author antoniony.celes
 */
public final class CampoMinado_Stub extends java.rmi.server.RemoteStub
        implements srvcampominado.CampoMinado, java.rmi.Remote {

    private static final long serialVersionUID = 2;
    private static java.lang.reflect.Method $method_criarCampo_0;
    private static java.lang.reflect.Method $method_finalizarGame_1;

    static {
        try {
            $method_criarCampo_0 = srvcampominado.CampoMinado.class.getMethod("criarCampo", new java.lang.Class[] {java.lang.String.class});
            $method_finalizarGame_1 = srvcampominado.CampoMinado.class.getMethod("criarCampo", new java.lang.Class[] {java.lang.String.class});
        } catch (java.lang.NoSuchMethodException e) {
            throw new java.lang.NoSuchMethodError(
                    "stub class initialization failed");
        }
    }
    public CampoMinado_Stub(java.rmi.server.RemoteRef ref) {
	super(ref);
    }
    @Override
    public void criarCampo() throws RemoteException {
       try {
	    ref.invoke(this, $method_criarCampo_0, new java.lang.Object[] {}, -340880309497760548L);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }

    /**
     *
     * @param Pontos
     * @throws RemoteException
     */
    @Override
    public void finalizarGame(int Pontos) throws RemoteException {
       try {
	    Object $result = ref.invoke(this, $method_finalizarGame_1, null, -2209142245010403937L);
	    
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
}
