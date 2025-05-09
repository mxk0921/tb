package tb;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamic.tempate.DinamicTemplate;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.lang.reflect.Field;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class d65 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String d = "DPreRenderTask";

    /* renamed from: a  reason: collision with root package name */
    public List<DinamicTemplate> f17617a;
    public String b;
    public Context c;

    static {
        t2o.a(444596242);
    }

    public d65(Context context, String str, List<DinamicTemplate> list) {
        this.f17617a = list;
        this.b = str;
        this.c = context.getApplicationContext();
    }

    private void a(bew bewVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ac5940d", new Object[]{this, bewVar});
            return;
        }
        List<DinamicTemplate> list = this.f17617a;
        if (list != null) {
            for (DinamicTemplate dinamicTemplate : list) {
                DXTemplateItem dXTemplateItem = null;
                tfw k = q65.q(this.b).k(bewVar, null, dinamicTemplate);
                if (k.f()) {
                    la6.f(h36.TAG, h36.TAG, "asyncCreateTemplateView success:" + dinamicTemplate.name);
                    zm6.g().b(k, dinamicTemplate, this.b);
                } else {
                    String b = k.b().b();
                    la6.f(h36.TAG, h36.TAG, "asyncCreateTemplateView fail:\n" + b);
                    if (TextUtils.isEmpty(b) || (!b.contains(mm7.ERROR_CODE_TEMPLATE_FILE_LOST) && !b.contains(mm7.ERROR_CODE_TEMPLATE_NOT_FOUND))) {
                        if (dinamicTemplate != null) {
                            dXTemplateItem = b(dinamicTemplate);
                        }
                        String str = this.b;
                        ic5.s(str, dXTemplateItem, "AsyncRender", "Pre_Render_2.0_Fail", f.V2_PRE_RENDER_FAIL, "asyncCreateTemplateView fail" + k.b().b());
                    }
                }
            }
        }
    }

    private DXTemplateItem b(DinamicTemplate dinamicTemplate) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DXTemplateItem) ipChange.ipc$dispatch("62779590", new Object[]{this, dinamicTemplate});
        }
        if (dinamicTemplate == null) {
            return null;
        }
        try {
            DXTemplateItem dXTemplateItem = new DXTemplateItem();
            dXTemplateItem.f7343a = dinamicTemplate.name;
            if (!TextUtils.isEmpty(dinamicTemplate.version)) {
                dXTemplateItem.b = Long.parseLong(dinamicTemplate.version);
            } else {
                dXTemplateItem.b = -1L;
            }
            dXTemplateItem.c = dinamicTemplate.templateUrl;
            return dXTemplateItem;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Field declaredField = Looper.class.getDeclaredField("sThreadLocal");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(Looper.getMainLooper());
            if (obj instanceof ThreadLocal) {
                ((ThreadLocal) obj).set(Looper.getMainLooper());
            }
            a(new bew(this.c));
        } catch (Throwable th) {
            ic5.s("dinamicx", null, "AsyncRender", "Pre_Render_2.0_Crash", f.V2_PRE_RENDER_CRASH, xv5.a(th));
        }
    }
}
