package com.alibaba.fastjson.serializer;

import java.io.IOException;
import java.lang.reflect.Type;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class EnumSerializer implements ObjectSerializer {
    @Override // com.alibaba.fastjson.serializer.ObjectSerializer
    public void write(JSONSerializer jSONSerializer, Object obj, Object obj2, Type type) throws IOException {
        SerializeWriter serializeWriter = jSONSerializer.out;
        if ((serializeWriter.features & SerializerFeature.WriteEnumUsingToString.mask) != 0) {
            String str = ((Enum) obj).toString();
            if ((serializeWriter.features & SerializerFeature.UseSingleQuotes.mask) != 0) {
                serializeWriter.writeStringWithSingleQuote(str);
            } else {
                serializeWriter.writeStringWithDoubleQuote(str, (char) 0, false);
            }
        } else {
            serializeWriter.writeInt(((Enum) obj).ordinal());
        }
    }
}
