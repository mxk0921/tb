package tb;

import android.os.FileObserver;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.io.File;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class c5s extends FileObserver {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f16879a;

    static {
        t2o.a(767557739);
    }

    public c5s(String str) {
        super(str, 3904);
        this.f16879a = str;
    }

    public static /* synthetic */ Object ipc$super(c5s c5sVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/log/utils/TLogFileObserver");
    }

    @Override // android.os.FileObserver
    public void onEvent(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb74f7cb", new Object[]{this, new Integer(i), str});
            return;
        }
        if (str != null) {
            try {
                if (str.contains(File.separator) || !str.endsWith(b5s.LOG_SUFFIX_TLOG) || !str.contains(b5s.LOG_SUFFIX_TLOG)) {
                    return;
                }
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        if (i == 64) {
            TLog.loge("TLogFileObserver", "", "The file had been moved: " + this.f16879a + File.separator + str);
        } else if (i == 256) {
            TLog.loge("TLogFileObserver", "", "The file had been created: " + this.f16879a + File.separator + str);
        } else if (i == 512) {
            TLog.loge("TLogFileObserver", "", "The file had been deleted: " + this.f16879a + File.separator + str);
        } else if (i == 1024) {
            TLog.loge("TLogFileObserver", "", "The log dir had been deleted: " + this.f16879a);
        } else if (i == 2048) {
            TLog.loge("TLogFileObserver", "", "The log dir had been moved: " + this.f16879a);
        }
    }
}
