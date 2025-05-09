package tb;

import android.database.ContentObserver;
import android.util.Log;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class bhe extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    public final String f16391a;
    public final int b;
    public final ahe c;

    public bhe(ahe aheVar, int i, String str) {
        super(null);
        this.c = aheVar;
        this.b = i;
        this.f16391a = str;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        ahe aheVar = this.c;
        if (aheVar != null) {
            aheVar.S(this.b, this.f16391a);
        } else {
            Log.e("VMS_SDK_Observer", "mIdentifierIdClient is null");
        }
    }
}
