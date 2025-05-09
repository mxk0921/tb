package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.core.component.DWComponent;
import com.taobao.avplayer.core.protocol.DWInteractiveObject;
import com.taobao.avplayer.core.protocol.DWTimelineObject;
import com.taobao.media.MediaSystemUtils;
import java.util.ArrayList;
import org.json.JSONArray;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class k85 extends u65 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public DWTimelineObject[] h;
    public boolean i;

    static {
        t2o.a(452985099);
    }

    public k85(DWContext dWContext, h85 h85Var) {
        super(dWContext, h85Var);
    }

    public static /* synthetic */ Object ipc$super(k85 k85Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/interactivelifecycle/display/label/DWLabelController");
    }

    @Override // tb.f85
    public Class<? extends DWComponent> c(DWInteractiveObject dWInteractiveObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("153204b5", new Object[]{this, dWInteractiveObject});
        }
        if (dWInteractiveObject == null) {
            return null;
        }
        String type = dWInteractiveObject.getType();
        if (type.equalsIgnoreCase(e75.f18337a) && MediaSystemUtils.sIsSupportWeex) {
            return y65.a(e75.d);
        }
        String str = e75.b;
        if (type.equalsIgnoreCase(str)) {
            return y65.a(str);
        }
        return null;
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("471a0b1d", new Object[]{this});
        } else if (!this.i) {
            this.i = true;
            JSONArray interactive = this.b.getInteractive(u());
            if (interactive != null) {
                int length = interactive.length();
                this.c = new ArrayList(length);
                this.h = new DWTimelineObject[length];
                for (int i = 0; i < length; i++) {
                    this.h[i] = new DWTimelineObject(interactive.optJSONObject(i));
                }
                for (int i2 = 0; i2 < length; i2++) {
                    DWTimelineObject dWTimelineObject = this.h[i2];
                    g85 g85Var = new g85();
                    g85Var.b = dWTimelineObject.getStartTime();
                    g85Var.c = dWTimelineObject.getEndTime();
                    g85Var.e = b(dWTimelineObject, DWVideoScreenType.NORMAL);
                    g85Var.f = b(dWTimelineObject, DWVideoScreenType.PORTRAIT_FULL_SCREEN);
                    g85Var.g = b(dWTimelineObject, DWVideoScreenType.LANDSCAPE_FULL_SCREEN);
                    g85Var.i = dWTimelineObject.getUtParams();
                    ((ArrayList) this.c).add(i2, g85Var);
                    e(g85Var.e, g85Var.f, g85Var.g);
                }
            }
        }
    }

    public String u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("426047ff", new Object[]{this});
        }
        return "4";
    }
}
