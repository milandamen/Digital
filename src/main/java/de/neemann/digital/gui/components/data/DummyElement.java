package de.neemann.digital.gui.components.data;

import de.neemann.digital.core.Model;
import de.neemann.digital.core.NodeException;
import de.neemann.digital.core.ObservableValue;
import de.neemann.digital.core.element.Element;
import de.neemann.digital.core.element.ElementAttributes;
import de.neemann.digital.core.element.ElementTypeDescription;
import de.neemann.digital.core.element.Keys;

/**
 * Only a placeholder.
 * Has no connections to the model!
 *
 * @author hneemann
 */
public class DummyElement implements Element {

    /**
     * The DataElement description
     */
    public static final ElementTypeDescription DATADESCRIPTION = new ElementTypeDescription("Data", DummyElement.class)
            .addAttribute(Keys.MicroStep)
            .addAttribute(Keys.MaxStepCount);

    /**
     * The TextElement description
     */
    public static final ElementTypeDescription TEXTDESCRIPTION = new ElementTypeDescription("Text", DummyElement.class)
            .addAttribute(Keys.Label);

    /**
     * Creates a new dummy element
     *
     * @param attr the attributes
     */
    public DummyElement(ElementAttributes attr) {
    }

    @Override
    public void setInputs(ObservableValue... inputs) throws NodeException {
    }

    @Override
    public ObservableValue[] getOutputs() {
        return new ObservableValue[0];
    }

    @Override
    public void registerNodes(Model model) {
    }

}
