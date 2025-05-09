package tb;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class znc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "data")
    public Map<String, String> data = null;

    static {
        t2o.a(767557672);
    }

    public Map<String, String> getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("516a2e9c", new Object[]{this});
        }
        return this.data;
    }

    public abstract void log();

    public void log(Executor executor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73c0f2eb", new Object[]{this, executor});
        } else if (executor != null) {
            executor.execute(new Runnable() { // from class: tb.vnc
                @Override // java.lang.Runnable
                public final void run() {
                    znc.this.log();
                }
            });
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return JSON.toJSONString(this);
    }
}
