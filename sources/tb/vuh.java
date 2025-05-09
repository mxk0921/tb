package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class vuh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, quh> f30266a = new ConcurrentHashMap<>();
    public final String b;

    static {
        new AtomicLong(0L);
    }

    public vuh(String str) {
        this.b = str;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.b;
    }

    public boolean b(quh quhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2d9a12c2", new Object[]{this, quhVar})).booleanValue();
        }
        if (quhVar == null) {
            return false;
        }
        this.f30266a.put(quhVar.x(), quhVar);
        return true;
    }

    public void c(quh quhVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f29c25f", new Object[]{this, quhVar});
        } else if (quhVar == null) {
            TLog.loge("MTSScene", "removeMeter error meter is null");
        } else if (TextUtils.isEmpty(quhVar.x())) {
            TLog.loge("MTSScene", "removeMeter error uniqueId is null");
        } else {
            this.f30266a.remove(quhVar.x());
        }
    }
}
