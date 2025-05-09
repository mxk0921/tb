package tb;

import com.alibaba.fastjson.parser.JSONLexer;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSValue;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.weex.common.Constants;
import com.taobao.weex.utils.WXUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class tvu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final UINode f28992a;

    static {
        t2o.a(986710094);
    }

    public tvu(UINode uINode) {
        this.f28992a = uINode;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f678800b", new Object[]{this});
        } else {
            this.f28992a.getNodeInfo().o();
        }
    }

    public final void b(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9abbd406", new Object[]{this, mUSValue});
        } else if (MUSValue.isNill(mUSValue)) {
            this.f28992a.getNodeInfo().Q(false);
        } else {
            this.f28992a.getNodeInfo().Q(mUSValue.getBoolValue());
        }
    }

    public final void c(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77056100", new Object[]{this, mUSValue});
        } else if (MUSValue.isNill(mUSValue)) {
            this.f28992a.getNodeInfo().R("");
        } else {
            this.f28992a.getNodeInfo().R(mUSValue.getStringValue());
        }
    }

    public final void d(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca1b8d2", new Object[]{this, mUSValue});
        } else if (MUSValue.isNill(mUSValue)) {
            this.f28992a.getNodeInfo().S(null);
        } else {
            this.f28992a.getNodeInfo().S(mUSValue.getStringValue());
        }
    }

    public final void e(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bc1b3aa", new Object[]{this, mUSValue});
        } else if (MUSValue.isNill(mUSValue)) {
            this.f28992a.getNodeInfo().T(null);
        } else {
            this.f28992a.getNodeInfo().T(new xn1(cxh.c(mUSValue.getStringValue())));
        }
    }

    public final void f(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c12c5da2", new Object[]{this, mUSValue});
        } else if (MUSValue.isNill(mUSValue)) {
            this.f28992a.getNodeInfo().U(null);
        } else {
            this.f28992a.getNodeInfo().U(cxh.b(mUSValue));
        }
    }

    public final void g(int i, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f73967d1", new Object[]{this, new Integer(i), mUSValue});
        } else if (MUSValue.isNill(mUSValue)) {
            this.f28992a.getNodeInfo().s(true).p(i);
        } else {
            this.f28992a.getNodeInfo().s(true).u(i, cxh.c(mUSValue.getStringValue()));
        }
    }

    public final void h(int i, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83b3f24c", new Object[]{this, new Integer(i), mUSValue});
        } else if (MUSValue.isNill(mUSValue)) {
            this.f28992a.getNodeInfo().s(true).q(i);
        } else {
            this.f28992a.getNodeInfo().s(true).x(i, jxh.h(fxh.c(mUSValue)));
        }
    }

    public final void i(int i, MUSValue mUSValue) {
        int i2 = 2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ed7d743", new Object[]{this, new Integer(i), mUSValue});
        } else if (MUSValue.isNill(mUSValue)) {
            this.f28992a.getNodeInfo().s(true).r(i);
        } else {
            String stringValue = mUSValue.getStringValue();
            stringValue.hashCode();
            if (!stringValue.equals(pg1.ATOM_EXT_dashed)) {
                if (!stringValue.equals(pg1.ATOM_EXT_dotted)) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
            }
            this.f28992a.getNodeInfo().s(true).y(i, i2);
        }
    }

    public final void j(int i, MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("245167ce", new Object[]{this, new Integer(i), mUSValue});
        } else if (MUSValue.isNill(mUSValue)) {
            this.f28992a.getNodeInfo().s(true).s(i);
        } else {
            this.f28992a.getNodeInfo().s(true).z(i, jxh.h(mUSValue.convertToFloat()));
        }
    }

    public final void k(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a85ae1e0", new Object[]{this, mUSValue});
        } else if (MUSValue.isNill(mUSValue)) {
            this.f28992a.getNodeInfo().Y(1.0f);
        } else {
            this.f28992a.getNodeInfo().Y(Math.max(0.0f, Math.min(1.0f, mUSValue.convertToFloat())));
        }
    }

    public final void l(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7df4c1e6", new Object[]{this, mUSValue});
        } else if (MUSValue.isNill(mUSValue)) {
            this.f28992a.getNodeInfo().Z(0, 0, 0, 0);
        } else {
            int h = jxh.h(mUSValue.convertToFloat());
            this.f28992a.getNodeInfo().Z(h, h, h, h);
        }
    }

    public final void m(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c8a38b1", new Object[]{this, mUSValue});
        } else if (MUSValue.isNill(mUSValue)) {
            this.f28992a.getNodeInfo().a0(0);
        } else {
            this.f28992a.getNodeInfo().a0(jxh.h(mUSValue.convertToFloat()));
        }
    }

    public final void n(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f847630d", new Object[]{this, mUSValue});
        } else if (MUSValue.isNill(mUSValue)) {
            this.f28992a.getNodeInfo().b0(0);
        } else {
            this.f28992a.getNodeInfo().b0(jxh.h(mUSValue.convertToFloat()));
        }
    }

    public final void o(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b76378be", new Object[]{this, mUSValue});
        } else if (MUSValue.isNill(mUSValue)) {
            this.f28992a.getNodeInfo().c0(0);
        } else {
            this.f28992a.getNodeInfo().c0(jxh.h(mUSValue.convertToFloat()));
        }
    }

    public final void p(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f56577", new Object[]{this, mUSValue});
        } else if (MUSValue.isNill(mUSValue)) {
            this.f28992a.getNodeInfo().d0(0);
        } else {
            this.f28992a.getNodeInfo().d0(jxh.h(mUSValue.convertToFloat()));
        }
    }

    public final void q(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66286b01", new Object[]{this, mUSValue});
        } else if (MUSValue.isNill(mUSValue)) {
            this.f28992a.getNodeInfo().e0(null);
        } else {
            this.f28992a.getNodeInfo().e0(mUSValue.getStringValue());
        }
    }

    public final void r(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226a4548", new Object[]{this, mUSValue});
        } else if (MUSValue.isNill(mUSValue)) {
            this.f28992a.getNodeInfo().f0(null);
        } else {
            this.f28992a.getNodeInfo().f0(mUSValue.getStringValue());
        }
    }

    public final void s(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94eb003", new Object[]{this, mUSValue});
        } else if (MUSValue.isNill(mUSValue)) {
            this.f28992a.getNodeInfo().g0(null);
        } else {
            this.f28992a.getNodeInfo().g0(mUSValue.getStringValue());
        }
    }

    public final void t(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23f6afc", new Object[]{this, mUSValue});
        } else if (MUSValue.isNill(mUSValue)) {
            this.f28992a.getNodeInfo().h0(null);
        } else {
            this.f28992a.getNodeInfo().h0(mUSValue.getStringValue());
        }
    }

    public final void u(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f059153d", new Object[]{this, mUSValue});
        } else if (MUSValue.isNill(mUSValue)) {
            this.f28992a.getNodeInfo().i0(null);
        } else {
            this.f28992a.getNodeInfo().i0(mUSValue.getStringValue());
        }
    }

    public final void v(MUSValue mUSValue) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5a750aa", new Object[]{this, mUSValue});
        } else if (MUSValue.isNill(mUSValue)) {
            this.f28992a.getNodeInfo().j0(null);
        } else {
            this.f28992a.getNodeInfo().j0(mUSValue.getStringValue());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public boolean w(String str, MUSValue mUSValue) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b74ec8b", new Object[]{this, str, mUSValue})).booleanValue();
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1998952146:
                if (str.equals("transitionDelay")) {
                    c = 0;
                    break;
                }
                break;
            case -1989576717:
                if (str.equals("borderRightColor")) {
                    c = 1;
                    break;
                }
                break;
            case -1974639039:
                if (str.equals("borderRightStyle")) {
                    c = 2;
                    break;
                }
                break;
            case -1971292586:
                if (str.equals("borderRightWidth")) {
                    c = 3;
                    break;
                }
                break;
            case -1724158635:
                if (str.equals("transition")) {
                    c = 4;
                    break;
                }
                break;
            case -1551689441:
                if (str.equals("ariaRole")) {
                    c = 5;
                    break;
                }
                break;
            case -1501175880:
                if (str.equals("paddingLeft")) {
                    c = 6;
                    break;
                }
                break;
            case -1470826662:
                if (str.equals("borderTopColor")) {
                    c = 7;
                    break;
                }
                break;
            case -1455888984:
                if (str.equals("borderTopStyle")) {
                    c = '\b';
                    break;
                }
                break;
            case -1452542531:
                if (str.equals("borderTopWidth")) {
                    c = '\t';
                    break;
                }
                break;
            case -1308858324:
                if (str.equals("borderBottomColor")) {
                    c = '\n';
                    break;
                }
                break;
            case -1293920646:
                if (str.equals("borderBottomStyle")) {
                    c = 11;
                    break;
                }
                break;
            case -1290574193:
                if (str.equals("borderBottomWidth")) {
                    c = '\f';
                    break;
                }
                break;
            case -1267206133:
                if (str.equals("opacity")) {
                    c = '\r';
                    break;
                }
                break;
            case -1228066334:
                if (str.equals("borderTopLeftRadius")) {
                    c = 14;
                    break;
                }
                break;
            case -1111969773:
                if (str.equals(Constants.Name.ARIA_HIDDEN)) {
                    c = 15;
                    break;
                }
                break;
            case -962590849:
                if (str.equals("direction")) {
                    c = 16;
                    break;
                }
                break;
            case -863700117:
                if (str.equals(Constants.Name.ARIA_LABEL)) {
                    c = 17;
                    break;
                }
                break;
            case -806339567:
                if (str.equals("padding")) {
                    c = 18;
                    break;
                }
                break;
            case -699883785:
                if (str.equals("transitionTimingFunction")) {
                    c = 19;
                    break;
                }
                break;
            case -242276144:
                if (str.equals("borderLeftColor")) {
                    c = 20;
                    break;
                }
                break;
            case -227338466:
                if (str.equals("borderLeftStyle")) {
                    c = 21;
                    break;
                }
                break;
            case -223992013:
                if (str.equals("borderLeftWidth")) {
                    c = 22;
                    break;
                }
                break;
            case 90130308:
                if (str.equals("paddingTop")) {
                    c = 23;
                    break;
                }
                break;
            case 202355100:
                if (str.equals("paddingBottom")) {
                    c = 24;
                    break;
                }
                break;
            case 333432965:
                if (str.equals("borderTopRightRadius")) {
                    c = 25;
                    break;
                }
                break;
            case 425064969:
                if (str.equals("transitionDuration")) {
                    c = JSONLexer.EOI;
                    break;
                }
                break;
            case 529642498:
                if (str.equals("overflow")) {
                    c = 27;
                    break;
                }
                break;
            case 581268560:
                if (str.equals("borderBottomLeftRadius")) {
                    c = 28;
                    break;
                }
                break;
            case 588239831:
                if (str.equals("borderBottomRightRadius")) {
                    c = 29;
                    break;
                }
                break;
            case 713848971:
                if (str.equals("paddingRight")) {
                    c = 30;
                    break;
                }
                break;
            case 722830999:
                if (str.equals("borderColor")) {
                    c = 31;
                    break;
                }
                break;
            case 737768677:
                if (str.equals("borderStyle")) {
                    c = ' ';
                    break;
                }
                break;
            case 741115130:
                if (str.equals("borderWidth")) {
                    c = '!';
                    break;
                }
                break;
            case 1052666732:
                if (str.equals("transform")) {
                    c = '\"';
                    break;
                }
                break;
            case 1287124693:
                if (str.equals("backgroundColor")) {
                    c = '#';
                    break;
                }
                break;
            case 1292595405:
                if (str.equals("backgroundImage")) {
                    c = '$';
                    break;
                }
                break;
            case 1349188574:
                if (str.equals("borderRadius")) {
                    c = WXUtils.PERCENT;
                    break;
                }
                break;
            case 1423936074:
                if (str.equals("transitionProperty")) {
                    c = '&';
                    break;
                }
                break;
            case 1671764162:
                if (str.equals("display")) {
                    c = '\'';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                s(mUSValue);
                return true;
            case 1:
                g(2, mUSValue);
                return true;
            case 2:
                i(2, mUSValue);
                return true;
            case 3:
                j(2, mUSValue);
                return true;
            case 4:
                r(mUSValue);
                return true;
            case 5:
                d(mUSValue);
                return true;
            case 6:
                n(mUSValue);
                return true;
            case 7:
                g(1, mUSValue);
                return true;
            case '\b':
                i(1, mUSValue);
                return true;
            case '\t':
                j(1, mUSValue);
                return true;
            case '\n':
                g(3, mUSValue);
                return true;
            case 11:
                i(3, mUSValue);
                return true;
            case '\f':
                j(3, mUSValue);
                return true;
            case '\r':
                k(mUSValue);
                return true;
            case 14:
                h(0, mUSValue);
                return true;
            case 15:
                b(mUSValue);
                return true;
            case 16:
            case 27:
            case '\'':
                break;
            case 17:
                c(mUSValue);
                break;
            case 18:
                l(mUSValue);
                return true;
            case 19:
                v(mUSValue);
                return true;
            case 20:
                g(0, mUSValue);
                return true;
            case 21:
                i(0, mUSValue);
                return true;
            case 22:
                j(0, mUSValue);
                return true;
            case 23:
                p(mUSValue);
                return true;
            case 24:
                m(mUSValue);
                return true;
            case 25:
                h(1, mUSValue);
                return true;
            case 26:
                t(mUSValue);
                return true;
            case 28:
                h(3, mUSValue);
                return true;
            case 29:
                h(2, mUSValue);
                return true;
            case 30:
                o(mUSValue);
                return true;
            case 31:
                g(4, mUSValue);
                return true;
            case ' ':
                i(4, mUSValue);
                return true;
            case '!':
                j(4, mUSValue);
                return true;
            case '\"':
                q(mUSValue);
                return true;
            case '#':
                e(mUSValue);
                return true;
            case '$':
                f(mUSValue);
                return true;
            case '%':
                h(4, mUSValue);
                return true;
            case '&':
                u(mUSValue);
                return true;
            default:
                return false;
        }
        return true;
    }
}
