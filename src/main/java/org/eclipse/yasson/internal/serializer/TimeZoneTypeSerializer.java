/*******************************************************************************
 * Copyright (c) 2016 Oracle and/or its affiliates. All rights reserved.
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 and Eclipse Distribution License v. 1.0
 * which accompanies this distribution.
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 * Roman Grigoriadi
 ******************************************************************************/

package org.eclipse.yasson.internal.serializer;

import org.eclipse.yasson.internal.Marshaller;
import org.eclipse.yasson.model.JsonBindingModel;

import javax.json.stream.JsonGenerator;
import java.util.TimeZone;

/**
 * @author David Král
 */
public class TimeZoneTypeSerializer extends AbstractValueTypeSerializer<TimeZone> {

    public TimeZoneTypeSerializer(JsonBindingModel model) {
        super(model);
    }

    @Override
    protected void serialize(TimeZone obj, JsonGenerator generator, String key, Marshaller marshaller) {
        generator.write(key, obj.getID());
    }

    @Override
    protected void serialize(TimeZone obj, JsonGenerator generator, Marshaller marshaller) {
        generator.write(obj.getID());
    }
}
