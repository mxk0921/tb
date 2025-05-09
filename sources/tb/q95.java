package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.DWVideoScreenType;
import com.taobao.avplayer.core.component.DWComponent;
import com.taobao.avplayer.core.protocol.DWInteractiveObject;
import com.taobao.avplayer.core.protocol.DWTimelineObject;
import com.taobao.avplayer.interactivelifecycle.display.DWSourceTypeEnum;
import com.taobao.media.MediaSystemUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONArray;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class q95 extends u65 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public DWTimelineObject[] h;

    static {
        t2o.a(452985100);
    }

    public q95(DWContext dWContext, h85 h85Var) {
        super(dWContext, h85Var);
    }

    public static /* synthetic */ Object ipc$super(q95 q95Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/avplayer/interactivelifecycle/display/timeline/DWTimelineController");
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
        String str = dWInteractiveObject.mSource;
        String str2 = e75.f18337a;
        if (type.equalsIgnoreCase(str2) && MediaSystemUtils.sIsSupportWeex) {
            return y65.a(str2);
        }
        String str3 = e75.b;
        if (type.equalsIgnoreCase(str3)) {
            return y65.a(str3);
        }
        String str4 = e75.c;
        if (type.equalsIgnoreCase(str4) && DWSourceTypeEnum.CONTENTTAGTRACE.getValue().equalsIgnoreCase(str)) {
            return y65.a(e75.e);
        }
        if (!type.equalsIgnoreCase(str4) || !DWSourceTypeEnum.CONTENTTAG.getValue().equalsIgnoreCase(str)) {
            return null;
        }
        return y65.a(e75.f);
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("471a0b1d", new Object[]{this});
            return;
        }
        JSONArray interactive = this.b.getInteractive(u());
        if (interactive != null) {
            int length = interactive.length();
            this.h = new DWTimelineObject[length];
            this.c = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                this.h[i] = new DWTimelineObject(interactive.optJSONObject(i));
            }
            Arrays.sort(this.h);
            Map<String, Boolean> whiteWeexCmpList = this.f19096a.getWhiteWeexCmpList();
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < length; i2++) {
                DWTimelineObject dWTimelineObject = this.h[i2];
                if (dWTimelineObject != null) {
                    if (whiteWeexCmpList.size() > 0) {
                        if (!TextUtils.isEmpty(dWTimelineObject.getSource())) {
                            Boolean bool = whiteWeexCmpList.get(dWTimelineObject.getSource());
                            if (bool != null) {
                                if (!bool.booleanValue()) {
                                }
                            }
                        }
                    }
                }
                arrayList.add(dWTimelineObject.getSource());
                g85 g85Var = new g85();
                g85Var.b = dWTimelineObject.getStartTime();
                g85Var.c = dWTimelineObject.getEndTime();
                g85Var.e = b(dWTimelineObject, DWVideoScreenType.NORMAL);
                g85Var.f = b(dWTimelineObject, DWVideoScreenType.PORTRAIT_FULL_SCREEN);
                g85Var.g = b(dWTimelineObject, DWVideoScreenType.LANDSCAPE_FULL_SCREEN);
                g85Var.i = dWTimelineObject.getUtParams();
                g85Var.j = dWTimelineObject.getSource();
                if (!((ArrayList) this.c).contains(g85Var)) {
                    ((ArrayList) this.c).add(g85Var);
                }
                e(g85Var.e, g85Var.f, g85Var.g);
            }
            xge wXCmpUtilsCallback = this.f19096a.getWXCmpUtilsCallback();
            if (wXCmpUtilsCallback != null) {
                wXCmpUtilsCallback.a(arrayList);
            }
        }
    }

    public String u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("426047ff", new Object[]{this});
        }
        return "1";
    }
}
