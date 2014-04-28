package twigkit.markup;

import org.junit.Test;
import twigkit.markup.html.AbstractHtmlCapabilityTest;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Unit tests for the {@link twigkit.markup.ContainerTag} class.
 *
 * @author mr.olafsson
 */
public class ContainerTagTest extends AbstractHtmlCapabilityTest {

    @Test(expected = MarkupException.class)
    public void testDoubleClosing() throws Exception {
        System.out.println(ol().close().close());
    }

    @Test
    public void testValid() throws Exception {
        assertTrue(ol().close().validate());
    }

    @Test(expected = MarkupException.class)
    public void testInvalid() throws Exception {
        assertFalse(ol().validate());
    }
}