package com.taobao.android.editionswitcher.homepage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.statistic.TBS;
import tb.cqv;
import tb.o78;
import tb.ozb;
import tb.t2o;
import tb.v78;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class EditionSwitchView extends FrameLayout implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String PAGE_HOME = "Page_Home";
    public ozb mListener;
    public int mViewType = 0;
    public int remindKind = 0;

    static {
        t2o.a(456130671);
    }

    public EditionSwitchView(Context context, int i, ozb ozbVar) {
        super(context);
        this.mListener = ozbVar;
        setViewType(i);
    }

    public static void commitEvent(String str, int i, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb757923", new Object[]{str, new Integer(i), str2, str3});
            return;
        }
        try {
            TBS.Ext.commitEvent(str, i, str2, null, null, str3);
            cqv.u(str, str2 + "_BehaviX_UT", null, null, str3);
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ Object ipc$super(EditionSwitchView editionSwitchView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/editionswitcher/homepage/EditionSwitchView");
    }

    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        }
    }

    public void onDismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab76ab2", new Object[]{this});
        }
    }

    public void processLocationChanged(Context context, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e33c4a59", new Object[]{this, context, str, new Boolean(z)});
            return;
        }
        traceConfirmEvent(str, z);
        o78.I(context, str, o78.SWITCH_TYPE_HOME);
        ozb ozbVar = this.mListener;
        if (ozbVar != null) {
            ((v78.a) ozbVar).a();
        }
    }

    public void setViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("486795fb", new Object[]{this, new Integer(i)});
        } else if (i >= 0 && i < 2) {
            this.mViewType = i;
        }
    }

    public void traceCancelEvent() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca428c2", new Object[]{this});
            return;
        }
        String c = o78.c();
        if (this.mViewType == 0) {
            if (this.remindKind == 0) {
                str = "0";
            } else {
                str = "1";
            }
            commitEvent("Page_Home", 2101, "htao_button-areaautono", str, "", "area=" + c);
            return;
        }
        commitEvent("Page_Home", 2101, "htao_button-selectno", "area=" + c);
    }

    public void traceConfirmEvent(String str, boolean z) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c690de4", new Object[]{this, str, new Boolean(z)});
        } else if (this.mViewType == 0) {
            if (this.remindKind == 0) {
                str2 = "0";
            } else {
                str2 = "1";
            }
            String valueOf = String.valueOf(z ? 1 : 0);
            commitEvent("Page_Home", 2101, "htao_button-areaautoyes", str2, valueOf, "area=" + o78.c() + ",page_version=" + o78.i(getContext()).editionCode + ",option=" + str);
        } else {
            commitEvent("Page_Home", 2101, "htao_button-selectyes", "area=" + o78.c() + ",page_version=" + o78.i(getContext()).editionCode + ",option=" + str);
        }
    }

    public void traceShowEvent() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d91a25f", new Object[]{this});
        } else if (this.mViewType == 0) {
            if (this.remindKind == 0) {
                str = "0";
            } else {
                str = "1";
            }
            commitEvent("Page_Home", 2201, "htao_show-areaauto", str, null, "area=" + o78.c() + ",page_version=" + o78.i(getContext()).editionCode + ",option=" + o78.f(getContext()).editionCode);
        } else {
            commitEvent("Page_Home", 2201, "htao_show-select", "area=" + o78.c() + ",page_version=" + o78.i(getContext()).editionCode + ",option=" + o78.f(getContext()).editionCode);
        }
    }

    public static void commitEvent(String str, int i, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("684218b7", new Object[]{str, new Integer(i), str2, str3, str4, str5});
            return;
        }
        try {
            TBS.Ext.commitEvent(str, i, str2, str3, str4, str5);
            cqv.u(str, str2 + "_BehaviX_UT", null, null, str5);
        } catch (Exception unused) {
        }
    }
}
