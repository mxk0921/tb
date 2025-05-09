package com.alibaba.wireless.security.middletierplugin.open.fc.strategy;

import com.alibaba.wireless.security.SecExceptionCode;
import com.alibaba.wireless.security.middletierplugin.open.fc.AbstractC0141;
import com.alibaba.wireless.security.middletierplugin.open.fc.C0135;
import com.alibaba.wireless.security.middletierplugin.open.fc.C0139;
import com.alibaba.wireless.security.middletierplugin.open.fc.strategy.C0129;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.alibaba.wireless.security.middletierplugin.open.fc.strategy.б  reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0132 {

    /* renamed from: ш  reason: contains not printable characters */
    private static final String f132 = "BXLOG";

    /* renamed from: щ  reason: contains not printable characters */
    private static Random f133 = new Random();

    /* renamed from: ъ  reason: contains not printable characters */
    private static final boolean f134 = false;

    /* renamed from: а  reason: contains not printable characters */
    private int f135;

    /* renamed from: д  reason: contains not printable characters */
    private long f139;

    /* renamed from: и  reason: contains not printable characters */
    private IStrategyCallback f143;

    /* renamed from: м  reason: contains not printable characters */
    private HashMap f147;

    /* renamed from: б  reason: contains not printable characters */
    private long f136 = 0;

    /* renamed from: в  reason: contains not printable characters */
    private boolean f137 = false;

    /* renamed from: г  reason: contains not printable characters */
    private boolean f138 = false;

    /* renamed from: е  reason: contains not printable characters */
    private String f140 = "";

    /* renamed from: ё  reason: contains not printable characters */
    private long f159 = 10000;

    /* renamed from: ж  reason: contains not printable characters */
    private int f141 = 0;

    /* renamed from: з  reason: contains not printable characters */
    private int f142 = 1;

    /* renamed from: й  reason: contains not printable characters */
    private boolean f144 = false;

    /* renamed from: к  reason: contains not printable characters */
    private C0129.EnumC0130 f145 = C0129.EnumC0130.FAIL;

    /* renamed from: л  reason: contains not printable characters */
    private long f146 = 0;

    /* renamed from: н  reason: contains not printable characters */
    private String f148 = null;

    /* renamed from: о  reason: contains not printable characters */
    private AtomicBoolean f149 = new AtomicBoolean(false);

    /* renamed from: п  reason: contains not printable characters */
    private int f150 = 0;

    /* renamed from: р  reason: contains not printable characters */
    private String f151 = "";

    /* renamed from: с  reason: contains not printable characters */
    private boolean f152 = false;

    /* renamed from: т  reason: contains not printable characters */
    private boolean f153 = false;

    /* renamed from: у  reason: contains not printable characters */
    private boolean f154 = false;

    /* renamed from: ф  reason: contains not printable characters */
    private float f155 = 1.0f;

    /* renamed from: х  reason: contains not printable characters */
    private float f156 = 1.0f;

    /* renamed from: ц  reason: contains not printable characters */
    private String f157 = "";

    /* renamed from: ч  reason: contains not printable characters */
    private int f158 = 0;

    public C0132(int i, HashMap hashMap, IStrategyCallback iStrategyCallback, int i2) {
        String str;
        this.f135 = -1;
        this.f139 = 0L;
        this.f143 = null;
        this.f147 = null;
        this.f135 = i;
        this.f147 = new HashMap();
        this.f143 = iStrategyCallback;
        try {
            this.f139 = f133.nextLong();
            r0 = "[StrategyItem][Init] content : " + hashMap.toString();
            m94(hashMap, i2);
        } catch (Exception e) {
            C0135.m136(AbstractC0141.f220, SecExceptionCode.SEC_ERROR_MIDDLE_TIER_INIT_FAILED, 0L, "" + e.getMessage(), "Strategyitem", null, "" + this.f139, C0139.m139(i2, hashMap, this.f140, C0139.f199, C0139.f201), (C0135.m127(i2, hashMap) ? 6 : 0) + 1, false);
            str = "[StrategyItem][Init] SesseionID: " + this.f139 + "   BXUserReport: Strategyitem exception = " + e.getMessage();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x01de, code lost:
        if (r0 == 1) goto L_0x01e0;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a3  */
    /* renamed from: х  reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m94(java.util.HashMap r11, int r12) {
        /*
            Method dump skipped, instructions count: 724
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.middletierplugin.open.fc.strategy.C0132.m94(java.util.HashMap, int):void");
    }

    /* renamed from: а  reason: contains not printable characters */
    public boolean m95(boolean z) {
        return this.f149.getAndSet(z);
    }

    /* renamed from: б  reason: contains not printable characters */
    public int m96() {
        return this.f150;
    }

    /* renamed from: в  reason: contains not printable characters */
    public int m97() {
        return this.f135;
    }

    /* renamed from: г  reason: contains not printable characters */
    public long m98() {
        return this.f136;
    }

    /* renamed from: д  reason: contains not printable characters */
    public String m99() {
        return this.f151;
    }

    /* renamed from: е  reason: contains not printable characters */
    public int m100() {
        return this.f158;
    }

    /* renamed from: ж  reason: contains not printable characters */
    public long m101() {
        return this.f146;
    }

    /* renamed from: з  reason: contains not printable characters */
    public HashMap m102() {
        return this.f147;
    }

    /* renamed from: и  reason: contains not printable characters */
    public String m103() {
        return this.f140;
    }

    /* renamed from: й  reason: contains not printable characters */
    public long m104() {
        return this.f139;
    }

    /* renamed from: к  reason: contains not printable characters */
    public IStrategyCallback m105() {
        return this.f143;
    }

    /* renamed from: л  reason: contains not printable characters */
    public float m106() {
        return this.f155;
    }

    /* renamed from: м  reason: contains not printable characters */
    public float m107() {
        return this.f156;
    }

    /* renamed from: н  reason: contains not printable characters */
    public int m108() {
        return this.f142;
    }

    /* renamed from: о  reason: contains not printable characters */
    public String m109() {
        return this.f157;
    }

    /* renamed from: п  reason: contains not printable characters */
    public boolean m110() {
        return this.f154;
    }

    /* renamed from: р  reason: contains not printable characters */
    public boolean m111() {
        return this.f137;
    }

    /* renamed from: с  reason: contains not printable characters */
    public boolean m112() {
        return this.f138;
    }

    /* renamed from: т  reason: contains not printable characters */
    public boolean m113() {
        return this.f153;
    }

    /* renamed from: у  reason: contains not printable characters */
    public boolean m114() {
        return this.f144;
    }

    /* renamed from: ф  reason: contains not printable characters */
    public boolean m115() {
        return this.f152;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ц  reason: contains not printable characters */
    public String m116() {
        StringBuilder sb = new StringBuilder();
        sb.append("mBXLogin = ");
        sb.append(this.f137);
        sb.append(", mBXUI = ");
        sb.append(this.f138);
        sb.append(", mNeedRetry = ");
        sb.append(this.f144);
        sb.append(", mBXMainCode = ");
        sb.append(this.f135);
        sb.append(", mSessionId = ");
        sb.append(this.f139);
        sb.append(", mLocation = ");
        sb.append(this.f140.length() > 1000 ? this.f140.substring(0, 1000) : this.f140);
        sb.append(",  mExtraInfo = ");
        HashMap hashMap = this.f147;
        sb.append(hashMap == null ? "" : hashMap.toString());
        sb.append(", mExpectSubAction = ");
        sb.append(this.f146);
        sb.append(", mExpectMainAction = ");
        sb.append(this.f145);
        sb.append(", mApiTimeout = ");
        sb.append(this.f150);
        sb.append(", mBXUUID = ");
        sb.append(this.f151);
        sb.append(", mHideCloseBtn = ");
        sb.append(this.f154);
        sb.append(", mBXHeightNew = ");
        sb.append(this.f156);
        sb.append(", mCoverClose = ");
        sb.append(this.f142);
        return sb.toString();
    }

    /* renamed from: ё  reason: contains not printable characters */
    public C0129.EnumC0130 m117() {
        return this.f145;
    }
}
