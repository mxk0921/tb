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
public class dd9 extends w20 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Constructor<?> f17740a;

    static {
        t2o.a(444596354);
    }

    public dd9() {
        b();
    }

    public static /* synthetic */ Object ipc$super(dd9 dd9Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic/parser/FileParser");
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        try {
            Constructor<?> constructor = Class.forName("android.content.res.XmlBlock").getConstructor(byte[].class);
            this.f17740a = constructor;
            constructor.setAccessible(true);
        } catch (Exception e) {
            Log.e("Home.FileParser", "Fail to get XmlBlock", e);
        }
    }

    public XmlPullParser c(String str, DinamicTemplate dinamicTemplate, tfw tfwVar) {
        if (this.f17740a == null || dinamicTemplate == null) {
            tfwVar.b().a(mm7.ERROR_CODE_XML_BLOCK_CONSTRUCTOR_REFLECT_ERROR, mm7.ERROR_CODE_XML_BLOCK_CONSTRUCTOR_REFLECT_ERROR);
            return null;
        }
        DTemplateManager t = DTemplateManager.t(str);
        if (!t.h().d(t.k(dinamicTemplate))) {
            tfwVar.b().a(mm7.ERROR_CODE_TEMPLATE_FILE_LOST, "downloaded file lost");
            return null;
        }
        try {
            byte[] p = t.p(dinamicTemplate);
            if (!(p == null || p.length == 0)) {
                try {
                    Object b = bun.b(this.f17740a.newInstance(a(p, tfwVar)), "newParser", new Object[0]);
                    if (b instanceof XmlResourceParser) {
                        return (XmlResourceParser) b;
                    }
                    tfwVar.b().a(mm7.ERROR_CODE_XML_RES_PARSER_ERROR, mm7.ERROR_CODE_XML_RES_PARSER_ERROR);
                    return null;
                } catch (Exception e) {
                    tfwVar.b().a(mm7.ERROR_CODE_BYTE_TO_PARSER_ERROR, e.getMessage());
                    return null;
                }
            }
            tfwVar.b().a(mm7.ERROR_CODE_TEMPLATE_FILE_EMPTY, "downloaded file empty");
            return null;
        } catch (Exception e2) {
            tfwVar.b().a(mm7.ERROR_CODE_BYTE_READ_ERROR, e2.getMessage());
            return null;
        }
    }
}
