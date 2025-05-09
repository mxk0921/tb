package com.taobao.homepage.pop.view.popview;

import android.content.Context;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import tb.dbd;
import tb.e3b;
import tb.esu;
import tb.osu;
import tb.xq1;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class UcpPopView extends BasePopView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public esu mUCPSignal;

    public UcpPopView(Context context, IPopData iPopData, dbd dbdVar, xq1 xq1Var, e3b e3bVar, esu esuVar) {
        super(context, iPopData, dbdVar, xq1Var, e3bVar);
        this.mUCPSignal = esuVar;
    }

    public static /* synthetic */ Object ipc$super(UcpPopView ucpPopView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1673753583) {
            super.onHandlePopViewEvent(((Number) objArr[0]).intValue());
            return null;
        } else if (hashCode == 502967273) {
            super.onHandlePopViewMessage((String) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/homepage/pop/view/popview/UcpPopView");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
        if (r8.equals("cancel") == false) goto L_0x0028;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void notifyUCPStateIfNeed(java.lang.String r8) {
        /*
            r7 = this;
            r0 = 1
            r1 = 2
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.homepage.pop.view.popview.UcpPopView.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0015
            java.lang.String r4 = "42943a3c"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r7
            r1[r0] = r8
            r3.ipc$dispatch(r4, r1)
            return
        L_0x0015:
            tb.esu r3 = r7.mUCPSignal
            if (r3 != 0) goto L_0x001a
            return
        L_0x001a:
            r8.hashCode()
            r3 = 0
            java.lang.String r4 = "Terminal"
            r5 = -1
            int r6 = r8.hashCode()
            switch(r6) {
                case -1607243192: goto L_0x004a;
                case -1367724422: goto L_0x0041;
                case 951117504: goto L_0x0036;
                case 1282360109: goto L_0x002a;
                default: goto L_0x0028;
            }
        L_0x0028:
            r0 = -1
            goto L_0x0054
        L_0x002a:
            java.lang.String r0 = "removePop"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0034
            goto L_0x0028
        L_0x0034:
            r0 = 3
            goto L_0x0054
        L_0x0036:
            java.lang.String r0 = "confirm"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x003f
            goto L_0x0028
        L_0x003f:
            r0 = 2
            goto L_0x0054
        L_0x0041:
            java.lang.String r1 = "cancel"
            boolean r8 = r8.equals(r1)
            if (r8 != 0) goto L_0x0054
            goto L_0x0028
        L_0x004a:
            java.lang.String r0 = "endTime"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0053
            goto L_0x0028
        L_0x0053:
            r0 = 0
        L_0x0054:
            switch(r0) {
                case 0: goto L_0x0076;
                case 1: goto L_0x0067;
                case 2: goto L_0x0058;
                case 3: goto L_0x0076;
                default: goto L_0x0057;
            }
        L_0x0057:
            goto L_0x007d
        L_0x0058:
            tb.esu r8 = r7.mUCPSignal
            java.lang.String r0 = "Click"
            tb.osu.e(r8, r0, r2, r0)
            tb.esu r8 = r7.mUCPSignal
            tb.osu.e(r8, r4, r2, r0)
            r7.mUCPSignal = r3
            goto L_0x0076
        L_0x0067:
            tb.esu r8 = r7.mUCPSignal
            java.lang.String r0 = "Cancel"
            tb.osu.e(r8, r0, r2, r0)
            tb.esu r8 = r7.mUCPSignal
            tb.osu.e(r8, r4, r2, r0)
            r7.mUCPSignal = r3
            goto L_0x007d
        L_0x0076:
            tb.esu r8 = r7.mUCPSignal
            tb.osu.e(r8, r4, r2, r4)
            r7.mUCPSignal = r3
        L_0x007d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.homepage.pop.view.popview.UcpPopView.notifyUCPStateIfNeed(java.lang.String):void");
    }

    @Override // com.taobao.homepage.pop.view.popview.BasePopView
    public void onHandlePopViewEvent(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c3c8c11", new Object[]{this, new Integer(i)});
            return;
        }
        super.onHandlePopViewEvent(i);
        notifyUCPStateIfNeed(i);
    }

    @Override // com.taobao.homepage.pop.view.popview.BasePopView
    public void onHandlePopViewMessage(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dfaabe9", new Object[]{this, str});
            return;
        }
        super.onHandlePopViewMessage(str);
        notifyUCPStateIfNeed(str);
    }

    private void notifyUCPStateIfNeed(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("587ce851", new Object[]{this, new Integer(i)});
            return;
        }
        esu esuVar = this.mUCPSignal;
        if (esuVar != null) {
            if (i == 0) {
                osu.e(esuVar, "Click", 0, "Click");
                osu.e(this.mUCPSignal, esu.KEY_TERMINAL, 0, "Click");
                this.mUCPSignal = null;
            } else if (i == 1) {
                osu.e(esuVar, "Cancel", 0, "Cancel");
                osu.e(this.mUCPSignal, esu.KEY_TERMINAL, 0, "Cancel");
                this.mUCPSignal = null;
                return;
            } else if (i != 2) {
                return;
            }
            osu.e(this.mUCPSignal, esu.KEY_TERMINAL, 0, esu.KEY_TERMINAL);
            this.mUCPSignal = null;
        }
    }
}
