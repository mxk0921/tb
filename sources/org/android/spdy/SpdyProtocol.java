package org.android.spdy;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class SpdyProtocol {
    public static final int ACCS = 130;
    public static final int ACCS_0RTT = 4226;
    public static final int ACCS_1RTT = 8322;
    public static final int CDN = 130;
    public static final int CDN_0RTT = 4226;
    public static final int CDN_1RTT = 8322;
    public static final int CONG_CONTROL_BBR = 4;
    public static final int CONG_CONTROL_BBR_V2 = 5;
    public static final int CONG_CONTROL_CUBIC = 2;
    public static final int CONG_CONTROL_NONE = 0;
    public static final int CONG_CONTROL_RENO = 1;
    public static final int CUSTOM = 16;
    public static final int FORCE_PLAIN = 32768;
    public static final int H2 = 40;
    public static final int HTTP = 1;
    public static final int HTTP2 = 8;
    public static final int HTTP3 = 256;
    public static final int HTTP3_1RTT = 8448;
    public static final int HTTP3_PLAIN = 33024;
    @Deprecated
    public static final int L7E_SSSL_0RTT_HTTP2 = 20616;
    @Deprecated
    public static final int L7E_SSSL_1RTT_HTTP2 = 24712;
    public static final int MULTIPATH_MODE = 2048;
    public static final int PUBKEY_PSEQ_ACCS = 4;
    public static final int PUBKEY_PSEQ_ADASH = 9;
    public static final int PUBKEY_PSEQ_ARUP = 7;
    public static final int PUBKEY_PSEQ_CDN = 1;
    public static final int PUBKEY_PSEQ_OPEN = 11;
    public static final int PUBKEY_SEQ_ACCS = 3;
    public static final int PUBKEY_SEQ_ADASH = 8;
    public static final int PUBKEY_SEQ_AE = 5;
    public static final int PUBKEY_SEQ_ARUP = 6;
    public static final int PUBKEY_SEQ_CDN = 1;
    public static final int PUBKEY_SEQ_OPEN = 10;
    public static final int PUBKEY_SEQ_TEST = 0;
    public static final int QUIC = 4;
    public static final int QUIC_PLAIN = 32772;
    public static final int SLIGHTSSLV2 = 128;
    public static final int SLIGHTSSL_0_RTT_MODE = 4096;
    public static final int SLIGHTSSL_1_RTT_MODE = 8192;
    @Deprecated
    public static final int SLIGHTSSL_L7E = 16384;
    public static final int SPDY = 2;
    public static final int SSSL_0RTT_CUSTOM = 4240;
    public static final int SSSL_0RTT_HTTP2 = 4232;
    public static final int SSSL_0RTT_SPDY = 4226;
    public static final int SSSL_1RTT_CUSTOM = 8336;
    @Deprecated
    public static final int SSSL_1RTT_HTTP2 = 8328;
    @Deprecated
    public static final int SSSL_1RTT_SPDY = 8322;
    public static final int STANDARD_SSL = 32;
    public static final int TNET_IPV4_TO_IPV6_AUTO = 0;
    public static final int TNET_IPV4_TO_IPV6_OFF = 2;
    public static final int TNET_IPV4_TO_IPV6_ON = 1;
    public static final String TNET_PUBKEY_SG_KEY = "tnet_pksg_key";
    public static final int TUNNEL = 512;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public enum DataChannel {
        ReliableChannel(0),
        UnreliableChannel(1);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int dataChannel;

        DataChannel(int i) {
            this.dataChannel = i;
        }

        public static /* synthetic */ Object ipc$super(DataChannel dataChannel, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in org/android/spdy/SpdyProtocol$DataChannel");
        }

        public static DataChannel valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DataChannel) ipChange.ipc$dispatch("d7623159", new Object[]{str});
            }
            return (DataChannel) Enum.valueOf(DataChannel.class, str);
        }

        public int getDataChannelInt() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b72dfaa6", new Object[]{this})).intValue();
            }
            return this.dataChannel;
        }
    }
}
