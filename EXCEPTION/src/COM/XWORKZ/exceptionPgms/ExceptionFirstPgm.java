package COM.XWORKZ.exceptionPgms;

import java.awt.AWTException;
import java.awt.FontFormatException;
import java.awt.datatransfer.MimeTypeParseException;
import java.beans.IntrospectionException;
import java.io.IOException;
import java.net.NoRouteToHostException;
import java.nio.BufferOverflowException;
import java.nio.channels.AlreadyBoundException;
import java.nio.file.FileSystemAlreadyExistsException;
import java.rmi.MarshalException;
import java.rmi.NotBoundException;
import java.security.cert.CertificateException;
import java.text.ParseException;
import java.util.EmptyStackException;
import java.util.jar.JarException;
import java.util.prefs.BackingStoreException;
import java.util.zip.DataFormatException;

import javax.crypto.ShortBufferException;
import javax.management.BadAttributeValueExpException;
import javax.management.BadBinaryOpValueExpException;
import javax.management.BadStringOperationException;
import javax.management.JMException;
import javax.security.auth.DestroyFailedException;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.tree.ExpandVetoException;
import javax.swing.undo.CannotRedoException;
import javax.transaction.xa.XAException;
import javax.xml.crypto.KeySelectorException;
import javax.xml.crypto.dsig.XMLSignatureException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.stream.XMLStreamException;
import javax.xml.xpath.XPathException;

public class ExceptionFirstPgm {
     
	public void method1() throws BackingStoreException{
		System.out.println("method 1 running");
		throw new BackingStoreException("aaa");
	}
	//exception
	public void method2() throws NotBoundException{
		System.out.println("method 2 running");
		throw new NotBoundException();
		
	}
	public void method3() throws UnsupportedClassVersionError{
		System.out.println("method 3 running");
		throw new UnsupportedClassVersionError();
		
	}
	public void method4() throws XPathException{
		System.out.println("method 4 running");
		throw new XPathException("aaa");
		}
	public void method5() throws AlreadyBoundException{
		System.out.println("method 5 running");
		throw new AlreadyBoundException();
		}
	public void method6() throws AWTException{
		System.out.println("method 6 running");
		throw new AWTException("aaa");
		}
	public void method7() throws XMLSignatureException{
		System.out.println("method 7 running");
		throw new XMLSignatureException();
		}
	public	void method8() throws XMLStreamException{
		System.out.println("method 8 running");
		throw new  XMLStreamException();
		}
	public	void method9() throws XMLStreamException{
		System.out.println("method 9 running");
		throw new  XMLStreamException();
		}
	public	void method10() throws XPathException{
		System.out.println("method 10 running");
		throw new  XPathException("aaaa");
		}
	public	void method11() throws XAException{
		System.out.println("method 11 running");
		throw new  XAException();
		}
	public	void method12() throws JMException{
		System.out.println("method 12 running");
		throw new  JMException();
		}
	public void method13() throws LineUnavailableException{
		System.out.println("method 13 running");
		throw new LineUnavailableException();
	}
		public void method14() throws ParseException{
			System.out.println("method 14 running");
			throw new ParseException(null, 0);
		}
		public void method15() throws JarException{
			System.out.println("method 15 running");
			throw new JarException(null);
		}
		public void method16() throws KeySelectorException{
			System.out.println("method 16 running");
			throw new KeySelectorException("aaa");
		}
		public void method17() throws UnsupportedClassVersionError{
			System.out.println("method 17 running");
			throw new UnsupportedClassVersionError(null);
		}
		public void method18() throws IntrospectionException{
			System.out.println("method 18 running");
			throw new IntrospectionException(null);
		}
		public void method19() throws NoRouteToHostException{
			System.out.println("method 19 running");
			throw new NoRouteToHostException(null);
		}
		public void method20() throws DestroyFailedException{
			System.out.println("method 20 running");
			throw new DestroyFailedException(null);
		}
		public void method21() throws DatatypeConfigurationException{
			System.out.println("method 21 running");
			throw new DatatypeConfigurationException("aaa");
		}
		public void method22() throws BadStringOperationException{
			System.out.println("method 22 running");
			throw new BadStringOperationException("aaa");
		}
		public void method23() throws ShortBufferException{
			System.out.println("method 23 running");
			throw new ShortBufferException("aaa");
		}
		public void method24() throws BadAttributeValueExpException{
			System.out.println("method 24 running");
			throw new BadAttributeValueExpException("aaa");
		}
		public void method25() throws ExpandVetoException{
			System.out.println("method 25 running");
			throw new ExpandVetoException(null);
		}
		public void method26() throws MimeTypeParseException{
			System.out.println("method 26 running");
			throw new MimeTypeParseException("aaa");
		}
		public void method27() throws FontFormatException{
			System.out.println("method 27 running");
			throw new FontFormatException("aaa");
		}
		public void method28() throws BadBinaryOpValueExpException{
			System.out.println("method 28 running");
			throw new BadBinaryOpValueExpException(null);
		}
		public void method29() throws MarshalException{
			System.out.println("method 29 running");
			throw new MarshalException("aaa");
		}
		public void method30() throws CloneNotSupportedException{
			System.out.println("method 30 running");
			throw new CloneNotSupportedException("aaa");
		}
		public void method31() throws MidiUnavailableException{
			System.out.println("method 31 running");
			throw new MidiUnavailableException("aaa");
		}
		public void method32() throws CertificateException{
			System.out.println("method 32 running");
		throw new CertificateException();
		}
		public void method33() throws IOException{
			System.out.println("method 33 running");
			throw new IOException();
		}
		public void method34() throws DataFormatException{
			System.out.println("method 34running");
			throw new DataFormatException();
		}
		public void method35() throws CloneNotSupportedException{
			System.out.println("method 35 running");
			throw new CloneNotSupportedException();
		}
//runtime
		public void method36() {
			System.out.println("method 36 running");
			throw new SecurityException();
		}
		public void method37() {
			System.out.println("method 37 running");
			throw new ArrayIndexOutOfBoundsException();
		}
		public void method38() {
			System.out.println("method 38 running");
			throw new BufferOverflowException();
		}
		public void method39() {
			System.out.println("method 39 running");
			throw new CannotRedoException();
		}
		public void method40() {
			System.out.println("method 40 running");
			throw new EmptyStackException();
		}
		public void method41() {
			System.out.println("method 40 running");
			throw new IllegalAccessError();
		}
		public void method42() {
			System.out.println("method 40 running");
			throw new FileSystemAlreadyExistsException();
		}
		public void method43() {
			System.out.println("method 40 running");
			throw new ;
		}
	
	
	
	
	
}
