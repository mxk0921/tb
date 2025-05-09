package tb;

import android.content.ComponentName;
import android.content.Intent;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.interactive_common.CXCommonActivity;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class s8w implements xnj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(731906052);
        t2o.a(578814049);
    }

    @Override // tb.xnj
    public String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        return "VideoListNavProcessor";
    }

    @Override // tb.xnj
    public boolean process(Intent intent, zmj zmjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3ebca67", new Object[]{this, intent, zmjVar})).booleanValue();
        }
        if (intent == null || zmjVar == null) {
            return true;
        }
        try {
            ComponentName component = intent.getComponent();
            if (component != null && TextUtils.equals("com.taobao.android.interactive.timeline.VideoListActivity2", component.getClassName()) && tyr.k(intent)) {
                intent.setClassName(zmjVar.d(), CXCommonActivity.class.getName());
            }
        } catch (Throwable th) {
            TLog.loge("VideoListNavProcessor", "afterNavTo error", th);
        }
        return true;
    }

    @Override // tb.xnj
    public boolean skip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fce928a", new Object[]{this})).booleanValue();
        }
        return false;
    }
}
