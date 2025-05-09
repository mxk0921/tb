package com.taobao.android.home.component.model;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class Extra implements IMTOPDataObject, Externalizable {
    private static final long serialVersionUID = -4080061466928613765L;
    public String actionName;
    public String param;

    static {
        t2o.a(473956358);
        t2o.a(589299906);
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        if (objectInput.readBoolean()) {
            this.actionName = objectInput.readUTF();
        }
        if (objectInput.readBoolean()) {
            this.param = objectInput.readUTF();
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        boolean z;
        boolean z2 = false;
        if (this.actionName != null) {
            z = true;
        } else {
            z = false;
        }
        objectOutput.writeBoolean(z);
        String str = this.actionName;
        if (str != null) {
            objectOutput.writeUTF(str);
        }
        if (this.param != null) {
            z2 = true;
        }
        objectOutput.writeBoolean(z2);
        String str2 = this.param;
        if (str2 != null) {
            objectOutput.writeUTF(str2);
        }
    }
}
