package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.ultron.common.model.IDMComponent;
import java.util.Iterator;
import java.util.Map;
import org.android.agoo.common.AgooConstants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class jn5 extends nb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_ISBOTTOMINULTRONGROUP = 2193661634150641582L;
    public static final long DX_PARSER_ISTOPINULTRONGROUP = -5570070731196683927L;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f22089a;

    static {
        t2o.a(350224430);
    }

    public jn5(boolean z) {
        this.f22089a = z;
    }

    public static /* synthetic */ Object ipc$super(jn5 jn5Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/adam/ultronExt/parser/DXDataParserIsTopOrBottomInUltronGroup");
    }

    public final boolean a(IDMComponent iDMComponent, boolean z, Object[] objArr) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6ca6566", new Object[]{this, iDMComponent, new Boolean(z), objArr})).booleanValue();
        }
        if (iDMComponent.getParent() == null || iDMComponent.getParent().getChildren() == null || iDMComponent.getParent().getChildren().size() == 0) {
            return false;
        }
        if (z) {
            if (objArr != null && objArr.length >= 2) {
                Object obj = objArr[1];
                if ((obj instanceof String) && !TextUtils.isEmpty((String) obj)) {
                    if (iDMComponent.getParent() != null && iDMComponent.getParent().getChildren() != null) {
                        Iterator<IDMComponent> it = iDMComponent.getParent().getChildren().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            IDMComponent next = it.next();
                            if (TextUtils.isEmpty(next.getPosition())) {
                                str = AgooConstants.MESSAGE_BODY;
                            } else {
                                str = next.getPosition();
                            }
                            if (objArr[1].equals(str)) {
                                if (next == iDMComponent) {
                                    return true;
                                }
                            }
                        }
                    }
                    return false;
                }
            }
            if (iDMComponent == iDMComponent.getParent().getChildren().get(0)) {
                return true;
            }
            return false;
        } else if (iDMComponent == iDMComponent.getParent().getChildren().get(iDMComponent.getParent().getChildren().size() - 1)) {
            return true;
        } else {
            return false;
        }
    }

    @Override // tb.nb5, tb.evb
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        Object q = dXRuntimeContext.q();
        if (!(q instanceof Map)) {
            return null;
        }
        Object obj = ((Map) q).get(xo7.TAG_DINAMICX_VIEW_COMPONENT);
        if (!(obj instanceof IDMComponent)) {
            return null;
        }
        IDMComponent iDMComponent = (IDMComponent) obj;
        if (objArr == null || objArr.length == 0 || !(objArr[0] instanceof String)) {
            return Boolean.valueOf(a(iDMComponent, this.f22089a, objArr));
        }
        while (iDMComponent != null) {
            if (a(iDMComponent, this.f22089a, objArr)) {
                iDMComponent = iDMComponent.getParent();
                if (objArr[0].equals(iDMComponent.getTag())) {
                    break;
                }
            } else {
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }
}
