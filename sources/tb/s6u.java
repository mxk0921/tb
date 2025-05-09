package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class s6u implements w9z {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public w9z f27831a;

    static {
        t2o.a(782237844);
        t2o.a(782237842);
    }

    public s6u(String str, String str2) {
        b(str, str2);
    }

    public void a(Context context, String str, int i, String str2, t1e t1eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc85754", new Object[]{this, context, str, new Integer(i), str2, t1eVar});
        } else if (this.f27831a == null) {
            TLog.loge("TpMediaExporter", "taopai export init fail");
        } else {
            addImageTask(context, false, str, i, str2, t1eVar);
        }
    }

    @Override // tb.w9z
    public void addImageTask(Context context, boolean z, String str, int i, String str2, t1e t1eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56fed84", new Object[]{this, context, new Boolean(z), str, new Integer(i), str2, t1eVar});
            return;
        }
        w9z w9zVar = this.f27831a;
        if (w9zVar == null) {
            TLog.loge("TpMediaExporter", "taopai export init fail");
        } else {
            w9zVar.addImageTask(context, z, str, i, str2, t1eVar);
        }
    }

    public void c(Context context, String str, String str2, String str3, int i, String str4, String str5, String str6, t1e t1eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d56a2574", new Object[]{this, context, str, str2, str3, new Integer(i), str4, str5, str6, t1eVar});
        } else {
            e(context, false, str, str2, str3, i, str4, str5, str6, t1eVar);
        }
    }

    @Override // tb.w9z
    public void cancelTask(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb849470", new Object[]{this, str});
            return;
        }
        w9z w9zVar = this.f27831a;
        if (w9zVar == null) {
            TLog.loge("TpMediaExporter", "taopai export init fail");
        } else {
            w9zVar.cancelTask(str);
        }
    }

    @Override // tb.w9z
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        w9z w9zVar = this.f27831a;
        if (w9zVar == null) {
            TLog.loge("TpMediaExporter", "taopai export init fail");
        } else {
            w9zVar.destroy();
        }
    }

    @Override // tb.w9z
    public void setImageCompressMinSide(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fa4aa6e", new Object[]{this, new Integer(i)});
            return;
        }
        w9z w9zVar = this.f27831a;
        if (w9zVar == null) {
            TLog.loge("TpMediaExporter", "taopai export init fail");
        } else {
            w9zVar.setImageCompressMinSide(i);
        }
    }

    @Override // tb.w9z
    public void setImageCompressQuality(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c9c59f8", new Object[]{this, new Integer(i)});
            return;
        }
        w9z w9zVar = this.f27831a;
        if (w9zVar == null) {
            TLog.loge("TpMediaExporter", "taopai export init fail");
        } else {
            w9zVar.setImageCompressQuality(i);
        }
    }

    @Override // tb.w9z
    public void addVideoTask(Context context, boolean z, String str, String str2, String str3, int i, String str4, String str5, String str6, Map<String, Object> map, t1e t1eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b4d6a7", new Object[]{this, context, new Boolean(z), str, str2, str3, new Integer(i), str4, str5, str6, map, t1eVar});
            return;
        }
        w9z w9zVar = this.f27831a;
        if (w9zVar == null) {
            TLog.loge("TpMediaExporter", "taopai export init fail");
        } else {
            w9zVar.addVideoTask(context, z, str, str2, str3, i, str4, str5, str6, map, t1eVar);
        }
    }

    public void e(Context context, boolean z, String str, String str2, String str3, int i, String str4, String str5, String str6, t1e t1eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdff9964", new Object[]{this, context, new Boolean(z), str, str2, str3, new Integer(i), str4, str5, str6, t1eVar});
            return;
        }
        w9z w9zVar = this.f27831a;
        if (w9zVar == null) {
            TLog.loge("TpMediaExporter", "taopai export init fail");
        } else {
            w9zVar.addVideoTask(context, z, str, str2, str3, i, str4, str5, str6, null, t1eVar);
        }
    }

    @Deprecated
    public s6u() {
        b("", "");
    }

    public final void b(String str, String str2) {
        try {
            Class<?> cls = Class.forName("com.taobao.taopai2.export.work.TpMediaExportTaskManager");
            Object newInstance = cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (!TextUtils.isEmpty(str)) {
                cls.getMethod("setBizLine", String.class).invoke(newInstance, str);
            }
            if (!TextUtils.isEmpty(str2)) {
                cls.getMethod("setBizScene", String.class).invoke(newInstance, str2);
            }
            this.f27831a = (w9z) newInstance;
            TLog.loge("TpMediaExporter", "initManager success ");
        } catch (Exception e) {
            TLog.loge("TpMediaExporter", "initManager Fail" + e.getMessage());
        }
    }
}
