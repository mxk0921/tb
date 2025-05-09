package com.taobao.android.diagnose.snapshot;

import android.os.FileObserver;
import android.text.TextUtils;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.diagnose.snapshot.ExceptionManager;
import com.taobao.tao.log.TLog;
import com.uc.crashsdk.export.LogType;
import java.io.File;
import tb.idh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class a extends FileObserver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f7256a;
    public final AbstractC0396a b;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.diagnose.snapshot.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface AbstractC0396a {
    }

    static {
        t2o.a(615514223);
    }

    public a(String str, AbstractC0396a aVar) {
        super(str, (int) LogType.UNEXP_OTHER);
        this.f7256a = str;
        this.b = aVar;
        idh.a("NativeCrashFileObserver", "NativeCrashFileObserver init: " + str);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/diagnose/snapshot/NativeCrashFileObserver");
    }

    public final void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f245f35", new Object[]{this, str});
        } else if (this.b != null) {
            TLog.loge("NativeCrashFileObserver", "", "The file had been created: " + this.f7256a + File.separator + str);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (str.endsWith("jni.log")) {
                ((ExceptionManager.a) this.b).b();
            } else if (str.endsWith("anr.log")) {
                ((ExceptionManager.a) this.b).a();
            }
        }
    }

    @Override // android.os.FileObserver
    public void onEvent(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb74f7cb", new Object[]{this, new Integer(i), str});
        } else if (i == 256) {
            try {
                a(str);
            } catch (Exception e) {
                idh.c("NativeCrashFileObserver", MspFlybirdDefine.FLYBIRD_FRAME_EVENT_TYPE.ON_EVENT, e);
            }
        }
    }
}
