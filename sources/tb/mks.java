package tb;

import android.content.Context;
import com.alibaba.ariver.engine.api.embedview.IEmbedCallback;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.embed.TriverEmbedTBVideoView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class mks extends TriverEmbedTBVideoView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final Context x;
    public final jqf y;

    static {
        t2o.a(852492392);
    }

    public mks(Context context, jqf jqfVar) {
        this.x = context;
        this.y = jqfVar;
    }

    public static /* synthetic */ Object ipc$super(mks mksVar, String str, Object... objArr) {
        if (str.hashCode() == 1664325763) {
            super.onCreate((Map) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/widget/platformview/TRWidgetVideoEmbedView");
    }

    @Override // com.taobao.avplayer.embed.TriverEmbedTBVideoView, com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void onCreate(Map<String, String> map) {
        super.onCreate(map);
        try {
            Field declaredField = TriverEmbedTBVideoView.class.getDeclaredField("c");
            declaredField.setAccessible(true);
            declaredField.set(this, new WeakReference(this.x));
        } catch (Throwable th) {
            RVLogger.e("TRWidgetVideoEmbedView", th);
        }
    }

    @Override // com.taobao.avplayer.embed.TriverEmbedTBVideoView, com.alibaba.ariver.integration.embedview.BaseEmbedView, com.alibaba.ariver.engine.api.embedview.IEmbedView
    public void sendEvent(String str, JSONObject jSONObject, IEmbedCallback iEmbedCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d2b74017", new Object[]{this, str, jSONObject, iEmbedCallback});
            return;
        }
        jqf jqfVar = this.y;
        if (jqfVar != null) {
            jqfVar.sendEvent(str, jSONObject);
        }
    }
}
