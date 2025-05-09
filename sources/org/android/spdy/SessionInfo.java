package org.android.spdy;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class SessionInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int INVALID_PUBLIC_SEQNUM = -1;
    private final String domain;
    private final String host;
    private final int mode;
    private final int port;
    private final String proxyHost;
    private final int proxyPort;
    private int recvRateBps;
    private final SessionCb sessionCb;
    private SessionCustomExtraCb sessionCustomExtraCb;
    private final Object sessionUserData;
    private int setMSS;
    private int tunnelRetryTimes;
    private String certHost = null;
    private volatile int connectIndex = 0;
    private boolean tryForceCellular = false;
    private ArrayList<StrategyInfo> tunnelInfoArrayList = null;
    private String tunnelInfo = null;
    private final String tunnelDomain = "test.xquic.com";
    private boolean multiPathCompensateEnable = false;
    private boolean multiPathParallelAddSpeedEnable = false;
    private int pubkey_seqnum = -1;
    private int connTimeoutMs = -1;
    private int cong_control = 0;

    public SessionInfo(String str, int i, String str2, String str3, int i2, Object obj, SessionCb sessionCb, int i3) {
        this.host = str;
        this.port = i;
        this.domain = str2;
        this.proxyHost = str3;
        this.proxyPort = i2;
        this.sessionUserData = obj;
        this.sessionCb = sessionCb;
        this.mode = i3;
    }

    public String getAuthority() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3dac808c", new Object[]{this});
        }
        if (this.proxyHost == null || this.proxyPort == 0) {
            return this.host + ":" + this.port;
        }
        return this.host + ":" + this.port + "/" + this.proxyHost + ":" + this.proxyPort;
    }

    public String getCertHost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fae080d7", new Object[]{this});
        }
        if (this.pubkey_seqnum != -1) {
            return null;
        }
        return this.certHost;
    }

    public int getConnectIndex() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f90a69f8", new Object[]{this})).intValue();
        }
        return this.connectIndex;
    }

    public int getConnectionTimeoutMs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7b39ed6d", new Object[]{this})).intValue();
        }
        return this.connTimeoutMs;
    }

    public String getDomain() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6fba2f7f", new Object[]{this});
        }
        return this.domain;
    }

    public int getMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56d77213", new Object[]{this})).intValue();
        }
        return this.mode;
    }

    public int getMss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("8e7bd951", new Object[]{this})).intValue();
        }
        return this.setMSS;
    }

    public boolean getMultiPathCompensateEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ea5878d", new Object[]{this})).booleanValue();
        }
        return this.multiPathCompensateEnable;
    }

    public boolean getMultiPathParallelAddSpeedEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ad2c23", new Object[]{this})).booleanValue();
        }
        return this.multiPathParallelAddSpeedEnable;
    }

    public int getPubKeySeqNum() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a280b6d9", new Object[]{this})).intValue();
        }
        return this.pubkey_seqnum;
    }

    public int getRecvRateBps() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a1f7aae3", new Object[]{this})).intValue();
        }
        return this.recvRateBps;
    }

    public SessionCb getSessionCb() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SessionCb) ipChange.ipc$dispatch("8fbe44bc", new Object[]{this});
        }
        return this.sessionCb;
    }

    public SessionCustomExtraCb getSessionCustomExtraCb() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SessionCustomExtraCb) ipChange.ipc$dispatch("954226dc", new Object[]{this});
        }
        return this.sessionCustomExtraCb;
    }

    public Object getSessonUserData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("66e7234f", new Object[]{this});
        }
        return this.sessionUserData;
    }

    public String getTunnelDomain() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7e1fc677", new Object[]{this});
        }
        return "test.xquic.com";
    }

    public ArrayList<StrategyInfo> getTunnelStrategyList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("72cac310", new Object[]{this});
        }
        return this.tunnelInfoArrayList;
    }

    public int getXquicCongControl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3716bdd2", new Object[]{this})).intValue();
        }
        return this.cong_control;
    }

    public boolean isTryForceCellular() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7cdb434f", new Object[]{this})).booleanValue();
        }
        return this.tryForceCellular;
    }

    public void setCertHost(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec0cf47f", new Object[]{this, str});
        } else {
            this.certHost = str;
        }
    }

    public void setConnectIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d95612", new Object[]{this, new Integer(i)});
        } else {
            this.connectIndex = i;
        }
    }

    public void setConnectionTimeoutMs(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bd0fdd5", new Object[]{this, new Integer(i)});
        } else {
            this.connTimeoutMs = i;
        }
    }

    public void setMss(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bb82671", new Object[]{this, new Integer(i)});
        } else if (i > 0 && i < 1500) {
            this.setMSS = i;
        }
    }

    public SessionInfo setMultiPathCompensateEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SessionInfo) ipChange.ipc$dispatch("9223ab5c", new Object[]{this, new Boolean(z)});
        }
        this.multiPathCompensateEnable = z;
        return this;
    }

    public SessionInfo setMultiPathParallelAddSpeedEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SessionInfo) ipChange.ipc$dispatch("f0d43e72", new Object[]{this, new Boolean(z)});
        }
        this.multiPathParallelAddSpeedEnable = z;
        return this;
    }

    public void setPubKeySeqNum(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("892ca551", new Object[]{this, new Integer(i)});
        } else {
            this.pubkey_seqnum = i;
        }
    }

    public void setRecvRateBps(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40fabb1f", new Object[]{this, new Integer(i)});
        } else {
            this.recvRateBps = i;
        }
    }

    public SessionInfo setSessionCustomExtraCb(SessionCustomExtraCb sessionCustomExtraCb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SessionInfo) ipChange.ipc$dispatch("c0468dbd", new Object[]{this, sessionCustomExtraCb});
        }
        if (sessionCustomExtraCb != null) {
            this.sessionCustomExtraCb = sessionCustomExtraCb;
        }
        return this;
    }

    public SessionInfo setTryForceCellular(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SessionInfo) ipChange.ipc$dispatch("92e11d62", new Object[]{this, new Boolean(z)});
        }
        this.tryForceCellular = z;
        return this;
    }

    public void setTunnelInfos(ArrayList<StrategyInfo> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("626f3ba8", new Object[]{this, arrayList});
        } else if (arrayList != null && arrayList != Collections.EMPTY_LIST) {
            this.tunnelInfoArrayList = new ArrayList<>(arrayList);
        }
    }

    public void setXquicCongControl(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7bd42378", new Object[]{this, new Integer(i)});
        } else {
            this.cong_control = i;
        }
    }

    @Deprecated
    public void setXquicLossDetect(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3811dd33", new Object[]{this, new Boolean(z)});
        }
    }

    @Deprecated
    public void setXquicPacing(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3046d338", new Object[]{this, new Integer(i)});
        }
    }
}
