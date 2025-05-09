package tb;

import android.content.res.XmlResourceParser;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.tempate.DTemplateManager;
import com.taobao.android.dinamic.tempate.DinamicTemplate;
import java.lang.reflect.Constructor;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class hd1 extends w20 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Constructor<?> f20556a;

    static {
        t2o.a(444596351);
    }

    public hd1() {
        b();
    }

    public static /* synthetic */ Object ipc$super(hd1 hd1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic/parser/AssetParser");
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        try {
            Constructor<?> constructor = Class.forName("android.content.res.XmlBlock").getConstructor(byte[].class);
            this.f20556a = constructor;
            constructor.setAccessible(true);
        } catch (Exception e) {
            Log.e("Home.AssetParser", "Fail to get XmlBlock", e);
        }
    }

    public XmlPullParser c(String str, DinamicTemplate dinamicTemplate, tfw tfwVar) {
        if (!(this.f20556a == null || dinamicTemplate == null)) {
            byte[] a2 = a(DTemplateManager.t(str).o(dinamicTemplate), tfwVar);
            if (a2 == null || a2.length == 0) {
                tfwVar.b().a(mm7.ERROR_CODE_TEMPLATE_FILE_EMPTY, "assert error");
            } else {
                try {
                    Object b = bun.b(this.f20556a.newInstance(a2), "newParser", new Object[0]);
                    if (b instanceof XmlResourceParser) {
                        return (XmlResourceParser) b;
                    }
                } catch (Exception e) {
                    tfwVar.b().a(mm7.ERROR_CODE_BYTE_TO_PARSER_ERROR, e.getMessage());
                }
                return null;
            }
        }
        return null;
    }
}
