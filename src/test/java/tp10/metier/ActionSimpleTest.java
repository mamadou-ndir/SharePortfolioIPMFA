/*
 * Copyright 2021 mamad.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package tp10.metier;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author mamad
 */
public class ActionSimpleTest {
    
    public ActionSimpleTest() {
    }

    @Test
    public void testConstructorNameIsSame() {
        ActionSimple anAction = new ActionSimple(NAME_TEST);
        
        String result = anAction.getNom();
        
        assertSame(NAME_TEST, result, "The name of the action must be the same as the one used to build ");
    }
    
    private static final String NAME_TEST = "NAME TEST";
    
}
