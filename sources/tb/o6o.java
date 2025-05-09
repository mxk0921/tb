package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.tempate.DTemplateManager;
import com.taobao.android.dinamic.tempate.DinamicTemplate;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class o6o extends w20 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(444596358);
    }

    public static /* synthetic */ Object ipc$super(o6o o6oVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamic/parser/ResParser");
    }

    public XmlPullParser b(String str, DinamicTemplate dinamicTemplate, tfw tfwVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (XmlPullParser) ipChange.ipc$dispatch("da8f1015", new Object[]{this, str, dinamicTemplate, tfwVar});
        }
        return DTemplateManager.t(str).i(dinamicTemplate);
    }
}
