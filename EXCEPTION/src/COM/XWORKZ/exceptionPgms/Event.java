package COM.XWORKZ.exceptionPgms;


	import java.awt.AWTError;
import java.awt.AWTException;
	import java.awt.FontFormatException;
import java.awt.color.CMMException;
import java.awt.color.ProfileDataException;
import java.awt.datatransfer.MimeTypeParseException;
import java.awt.image.DataBufferByte;
import java.awt.image.ImagingOpException;
import java.awt.image.RasterFormatException;
import java.beans.IntrospectionException;
import java.io.IOError;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.lang.instrument.UnmodifiableClassException;
import java.lang.reflect.GenericSignatureFormatError;
import java.lang.reflect.InaccessibleObjectException;
import java.lang.reflect.UndeclaredThrowableException;
import java.net.NoRouteToHostException;
import java.net.http.WebSocketHandshakeException;
import java.nio.BufferOverflowException;
	import java.nio.channels.AlreadyBoundException;
import java.nio.charset.CoderMalfunctionError;
import java.nio.file.FileSystemAlreadyExistsException;
	import java.rmi.MarshalException;
	import java.rmi.NotBoundException;
import java.security.ProviderException;
import java.security.cert.CertificateException;
	import java.text.ParseException;
	import java.util.EmptyStackException;
import java.util.MissingResourceException;
import java.util.jar.JarException;
	import java.util.prefs.BackingStoreException;
	import java.util.zip.DataFormatException;

	import javax.crypto.ShortBufferException;
import javax.lang.model.type.MirroredTypeException;
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
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.xpath.XPathException;

import org.w3c.dom.DOMException;
import org.w3c.dom.events.EventException;

	public class Event {
	     
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
				System.out.println("method 41 running");
				throw new IllegalAccessError();
			}
			public void method42() {
				System.out.println("method 42 running");
				throw new FileSystemAlreadyExistsException();
			}
			public void method43() {
      		System.out.println("method 43 running");
				throw new ImagingOpException(null);
			}
			public void method44() {
				System.out.println("method 44 running");
				throw new ClassCastException();
			}
			public void method45() {
				System.out.println("method 45 running");
				throw new ArrayIndexOutOfBoundsException();
			}
			public void method46() {
				System.out.println("method 46 running");
				throw new MirroredTypeException(null);
			}
			
			public void method47() {
				System.out.println("method 47 running");
				throw new ProviderException();
			}
			public void method48() throws DataFormatException {
				System.out.println("method 48 running");
				throw new DataFormatException();
			}
			public void method49() throws DataFormatException {
				System.out.println("method 49 running");
				throw new DataFormatException();
			}
			public void method50() throws DatatypeConfigurationException {
				System.out.println("method 50 running");
				throw new DatatypeConfigurationException();
			}
			public void method51() {
				System.out.println("method 51 running");
				throw new IncompatibleClassChangeError();
				}
			public void method52() throws DatatypeConfigurationException {
				System.out.println("method 52 running");
				throw new DatatypeConfigurationException();
			}
			public void method53() throws UnmodifiableClassException {
				System.out.println("method 53 running");
				throw new UnmodifiableClassException();
			}
			public void method54() {
				System.out.println("method 54 running");
				throw new ProfileDataException(null);
			}
			public void method55() throws WebSocketHandshakeException {
				System.out.println("method 55 running");
				throw new WebSocketHandshakeException(null);
			}
			public void method56() {
				System.out.println("method 56 running");
				throw new RasterFormatException(null);
			}
			public void method57() {
				System.out.println("method 57 running");
				throw new NullPointerException();
			}
			public void method58() {
				System.out.println("method 58 running");
				throw new UndeclaredThrowableException(null);
			}
			public void method59() throws IllegalAccessException {
				System.out.println("method 59 running");
				throw new IllegalAccessException(null);
			}
			public void method60() {
				System.out.println("method 60 running");
				throw new EnumConstantNotPresentException(null, null);
			}
			public void method61() {
				System.out.println("method 61 running");
				throw new DOMException((short) 0, null);
			}
			public void method62() {
				System.out.println("method 62 running");
				throw new MissingResourceException(null, null, null);
			}
			public void method63() {
				System.out.println("method 63 running");
				throw new ArrayStoreException();
			}
			public void method64() {
				System.out.println("method 64 running");
				throw new EventException((short) 0, null);
			}
			public void method65() {
				System.out.println("method 65 running");
				throw new CMMException(null);
			}
//error exception
			public void Method66() {
				System.out.println("Running method 66");
				throw new TransformerFactoryConfigurationError();
			}

			public void Method67() {
				System.out.println("Running method 67");
				throw new InternalError();
			}

			public void Method68() {
				System.out.println("Running method68");
				throw new OutOfMemoryError();
			}

			public void Method69() {
				System.out.println("Running method 69");
				throw new StackOverflowError();
			}

			public void Method70() {
				System.out.println("Running method 70");
				throw new UnknownError();
			}

			public void Method71() {
				System.out.println("Running method 71");
				throw new BootstrapMethodError();
			}

			public void Method72() {
				System.out.println("Running method72");
				throw new ExceptionInInitializerError();
			}

			public void Method73() {
				System.out.println("Running method 73");
				throw new ClassCircularityError();
			}

			public void Method74() {
				System.out.println("Running method 74");
				throw new ClassFormatError();
			}

			public void Method75() {
				System.out.println("Running method 75");
				throw new IncompatibleClassChangeError();
			}

			public void Method76() {
				System.out.println("Running method 76");
				throw new NoClassDefFoundError();
			}

			public void Method77() {
				System.out.println("Running method 77");
				throw new UnsatisfiedLinkError();
			}

			public void Method78() {
				System.out.println("Running method 78");
				throw new VerifyError();
			}

			public void Method79() {
				System.out.println("Running method 79");
				throw new GenericSignatureFormatError();
			}

			public void Method80() {
				System.out.println("Running method 80");
				throw new UnsupportedClassVersionError();
			}

			public void Method81() {
				System.out.println("Running method 81");
				throw new AbstractMethodError();
			}

			public void Method82() {
				System.out.println("Running method 82");
				throw new IllegalAccessError();
			}

			public void Method83() {
					System.out.println("Running method 83");
					throw new InstantiationError();
				}

			public void Method84() {
					System.out.println("Running method 84");
					throw new NoSuchFieldError();
				}

			public void Method85() {
					System.out.println("Running method 85");
					throw new NoSuchMethodError();
				}

			public void Method86() {
					System.out.println("Running method 86");
					throw new BootstrapMethodError();
				}
			  
			public void Method87() {
				System.out.println("Running method 87");
				throw new ClassFormatError(null);
			}

			public void Method88() {
				System.out.println("Running method 88");
				throw new AssertionError();
			}

			public void Method89() {
				System.out.println("Running method 89");
				throw new AWTError(null);
			}

			public void Method90() {
				System.out.println("Running method 90");
				throw new CoderMalfunctionError(null);
			}

			public void Method91() {
				System.out.println("Running method 91");
				throw new FactoryConfigurationError();
			}

			public void Method92() {
				System.out.println("Running method92");
				throw new FactoryConfigurationError();
			}

			public void Method93() {
				System.out.println("Running method 93");
				throw new IOError(null);
			}
			public void Method94() {
				System.out.println("Running method 94");
				throw new ImagingOpException(null);
			}
			public void Method95() {
				System.out.println("Running method 95");
				throw new InaccessibleObjectException(null);
			}
			public void Method96() {
				System.out.println("Running method 96");
				throw new IndexOutOfBoundsException(null);
			}
			public void Method97() {
				System.out.println("Running method 93");
				throw new UncheckedIOException(null);
			}
			public void Method98() {
				System.out.println("Running method 93");
				throw new ArithmeticException(null);
			}

			public void Method99() {
				System.out.println("Running method 94");
				throw new LinkageError();
			}

			public void Method100() {
				System.out.println("Running method100");
				throw new ClassCircularityError(null);
			}
}

			
		


