package com.taobao.android.weex_uikit.ui.cache;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_uikit.ui.MUSNodeHost;
import com.taobao.android.weex_uikit.ui.UINode;
import com.taobao.android.weex_uikit.widget.border.BorderProp;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import tb.cgl;
import tb.dwh;
import tb.fjd;
import tb.nrb;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class UIRenderView extends View implements fjd {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private MUSNodeHost mHost;
    private UINode mNode;
    private nrb mSimpleProvider = new cgl();
    private static Field sAttachInfoField = null;
    private static Method sAddTransientMethod = null;
    private static Method sRemoveTransientMethod = null;

    static {
        t2o.a(986710104);
        t2o.a(986710099);
    }

    public UIRenderView(Context context, UINode uINode) {
        super(context);
        setLayerType(0, null);
        this.mNode = uINode;
    }

    public static void attachToParent(MUSNodeHost mUSNodeHost, View view) {
        try {
            Field field = sAttachInfoField;
            if (field == null) {
                Method method = sAddTransientMethod;
                if (method != null) {
                    method.invoke(mUSNodeHost, view, 0);
                    return;
                }
                return;
            }
            sAttachInfoField.set(view, field.get(mUSNodeHost));
        } catch (Exception e) {
            dwh.i(e);
        }
    }

    public static /* synthetic */ Object ipc$super(UIRenderView uIRenderView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/ui/cache/UIRenderView");
    }

    public static boolean isAttachInfoEnabled() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f8289af", new Object[0])).booleanValue();
        }
        if (sAttachInfoField != null) {
            return true;
        }
        return false;
    }

    public static void removeFromParent(MUSNodeHost mUSNodeHost, View view) {
        try {
            Field field = sAttachInfoField;
            if (field == null) {
                Method method = sRemoveTransientMethod;
                if (method != null) {
                    method.invoke(mUSNodeHost, view);
                    return;
                }
                return;
            }
            field.set(view, null);
        } catch (Exception e) {
            dwh.i(e);
        }
    }

    @Override // tb.fjd
    public void attach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ad9c84c", new Object[]{this});
        } else {
            updateBorderRadius();
        }
    }

    public void detach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7b39a9a", new Object[]{this});
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        UINode uINode = this.mNode;
        if (uINode != null && this.mHost != null) {
            BorderProp s = uINode.getNodeInfo().s(false);
            if (s == null || s.k() == null) {
                this.mNode.drawWithRenderNode(this.mHost, canvas, false);
            } else {
                this.mNode.drawWithRenderNode(this.mHost, canvas, true ^ s.n());
            }
        }
    }

    @Override // tb.fjd
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cb6a66", new Object[]{this, new Integer(i), new Integer(i2)});
        }
    }

    @Override // tb.fjd
    public void setTarget(MUSNodeHost mUSNodeHost) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8c14eb7", new Object[]{this, mUSNodeHost});
        } else {
            this.mHost = mUSNodeHost;
        }
    }

    @Override // tb.fjd
    public void updateBorderRadius() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2772c4e", new Object[]{this});
            return;
        }
        UINode uINode = this.mNode;
        if (uINode != null) {
            BorderProp s = uINode.getNodeInfo().s(false);
            if (s == null || s.n()) {
                ((cgl) this.mSimpleProvider).b(this, getWidth(), getHeight(), s);
            } else {
                ((cgl) this.mSimpleProvider).b(this, getWidth(), getHeight(), null);
            }
        }
    }

    public static void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[0]);
        } else if (sAttachInfoField == null) {
            synchronized (UIRenderView.class) {
                if (sAttachInfoField == null) {
                    try {
                        Field declaredField = View.class.getDeclaredField("mAttachInfo");
                        sAttachInfoField = declaredField;
                        declaredField.setAccessible(true);
                    } catch (Exception unused) {
                    }
                    if (sAttachInfoField == null) {
                        try {
                            Method declaredMethod = ViewGroup.class.getDeclaredMethod("addTransientView", View.class, Integer.TYPE);
                            sAddTransientMethod = declaredMethod;
                            declaredMethod.setAccessible(true);
                            Method declaredMethod2 = ViewGroup.class.getDeclaredMethod("removeTransientView", View.class);
                            sRemoveTransientMethod = declaredMethod2;
                            declaredMethod2.setAccessible(true);
                        } catch (Exception unused2) {
                        }
                    }
                }
            }
        }
    }
}
