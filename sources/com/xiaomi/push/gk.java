package com.xiaomi.push;

import com.alipay.mobile.verifyidentity.ui.fb.plugin.BaseFBPlugin;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import tb.pg1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class gk {

    /* renamed from: a  reason: collision with root package name */
    private XmlPullParser f14906a;

    public gk() {
        try {
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            this.f14906a = newPullParser;
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
        } catch (XmlPullParserException unused) {
        }
    }

    public hh a(byte[] bArr, gq gqVar) {
        String str;
        String str2;
        this.f14906a.setInput(new InputStreamReader(new ByteArrayInputStream(bArr)));
        this.f14906a.next();
        int eventType = this.f14906a.getEventType();
        String name = this.f14906a.getName();
        if (eventType != 2) {
            return null;
        }
        if (name.equals("message")) {
            return hp.a(this.f14906a);
        }
        if (name.equals("iq")) {
            return hp.a(this.f14906a, gqVar);
        }
        if (name.equals("presence")) {
            return hp.m767a(this.f14906a);
        }
        if (this.f14906a.getName().equals("stream")) {
            return null;
        }
        if (!this.f14906a.getName().equals("error")) {
            if (this.f14906a.getName().equals(BaseFBPlugin.PWD_TIPS_TYPE.typeWarning)) {
                this.f14906a.next();
                str2 = this.f14906a.getName();
                str = "multi-login";
            } else {
                str2 = this.f14906a.getName();
                str = pg1.ATOM_EXT_bind;
            }
            str2.equals(str);
            return null;
        }
        throw new hb(hp.m768a(this.f14906a));
    }
}
