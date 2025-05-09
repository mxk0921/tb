package tb;

import android.content.Context;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class jb5 extends DXWidgetNode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DXAURAVIDEOVIEW_AURAVIDEOVIEW = 7965646646230168264L;
    public static final long DXAURAVIDEOVIEW_ENABLECONTROLSVIEW = 44800416707883368L;
    public static final long DXAURAVIDEOVIEW_ENABLEMUTEBUTTON = 2031920288429361294L;
    public static final long DXAURAVIDEOVIEW_ISORIGINMUTE = -609945470688825365L;
    public static final long DXAURAVIDEOVIEW_ONVIDEOLIFECYCLE = -3989344266007756940L;
    public static final long DXAURAVIDEOVIEW_SCALETYPE = 1015096712691932083L;
    public static final long DXAURAVIDEOVIEW_THUMBNAILSCALETYPE = -3390482391620443040L;
    public static final long DXAURAVIDEOVIEW_THUMBNAILURL = -738660921875005181L;
    public static final long DXAURAVIDEOVIEW_VIDEOID = 5435952498458972235L;
    public static final long DXAURAVIDEOVIEW_VIDEOURL = 7344459856848172626L;

    static {
        t2o.a(81789043);
    }

    public static /* synthetic */ Object ipc$super(jb5 jb5Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1775895211:
                Context context = (Context) objArr[0];
                View view = (View) objArr[1];
                ((Number) objArr[2]).longValue();
                throw null;
            case -303753557:
                Context context2 = (Context) objArr[0];
                View view2 = (View) objArr[1];
                throw null;
            case 253729832:
                ((Number) objArr[0]).longValue();
                throw null;
            case 650865254:
                ((Number) objArr[0]).intValue();
                ((Number) objArr[1]).intValue();
                throw null;
            case 1115049375:
                ((Number) objArr[0]).longValue();
                String str2 = (String) objArr[1];
                throw null;
            case 1327675976:
                DXEvent dXEvent = (DXEvent) objArr[0];
                throw null;
            case 2119721610:
                DXWidgetNode dXWidgetNode = (DXWidgetNode) objArr[0];
                ((Boolean) objArr[1]).booleanValue();
                throw null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/aura/taobao/adapter/extension/dx/widget/video/DXAURAVideoViewWidgetNode");
        }
    }
}
