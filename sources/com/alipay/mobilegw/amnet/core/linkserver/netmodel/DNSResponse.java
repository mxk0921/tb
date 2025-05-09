package com.alipay.mobilegw.amnet.core.linkserver.netmodel;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class DNSResponse extends Message {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DEFAULT_DOMAIN = "";
    public static final List<CmdIpAddress> DEFAULT_IPS = Collections.emptyList();
    public static final Integer DEFAULT_TTL = 0;
    public static final int TAG_DOMAIN = 1;
    public static final int TAG_IPS = 2;
    public static final int TAG_TTL = 3;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public String domain;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public List<CmdIpAddress> ips;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public Integer ttl;

    public DNSResponse(DNSResponse dNSResponse) {
        super(dNSResponse);
        if (dNSResponse != null) {
            this.domain = dNSResponse.domain;
            this.ips = Message.copyOf(dNSResponse.ips);
            this.ttl = dNSResponse.ttl;
        }
    }

    public static /* synthetic */ Object ipc$super(DNSResponse dNSResponse, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/mobilegw/amnet/core/linkserver/netmodel/DNSResponse");
    }

    public boolean equals(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DNSResponse)) {
            return false;
        }
        DNSResponse dNSResponse = (DNSResponse) obj;
        if (!equals(this.domain, dNSResponse.domain) || !equals((List<?>) this.ips, (List<?>) dNSResponse.ips) || !equals(this.ttl, dNSResponse.ttl)) {
            return false;
        }
        return true;
    }

    public DNSResponse fillTagValue(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DNSResponse) ipChange.ipc$dispatch("9a61295a", new Object[]{this, new Integer(i), obj});
        }
        if (i == 1) {
            this.domain = (String) obj;
        } else if (i == 2) {
            this.ips = Message.immutableCopyOf((List) obj);
        } else if (i == 3) {
            this.ttl = (Integer) obj;
        }
        return this;
    }

    public int hashCode() {
        int i;
        int i2 = 0;
        int i3 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
        }
        int i4 = this.hashCode;
        if (i4 != 0) {
            return i4;
        }
        String str = this.domain;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 37;
        List<CmdIpAddress> list = this.ips;
        if (list != null) {
            i3 = list.hashCode();
        }
        int i6 = (i5 + i3) * 37;
        Integer num = this.ttl;
        if (num != null) {
            i2 = num.hashCode();
        }
        int i7 = i6 + i2;
        this.hashCode = i7;
        return i7;
    }

    public DNSResponse() {
    }
}
