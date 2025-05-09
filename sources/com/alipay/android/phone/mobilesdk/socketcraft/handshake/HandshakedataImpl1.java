package com.alipay.android.phone.mobilesdk.socketcraft.handshake;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collections;
import java.util.Iterator;
import java.util.TreeMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class HandshakedataImpl1 implements HandshakeBuilder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public byte[] f3757a;
    public final TreeMap<String, String> b = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.handshake.Handshakedata
    public byte[] getContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("8fb14ed3", new Object[]{this});
        }
        return this.f3757a;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.handshake.Handshakedata
    public String getFieldValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4e98f502", new Object[]{this, str});
        }
        String str2 = this.b.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.handshake.Handshakedata
    public boolean hasFieldValue(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f3edaa6", new Object[]{this, str})).booleanValue();
        }
        return this.b.containsKey(str);
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.handshake.Handshakedata
    public Iterator<String> iterateHttpFields() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Iterator) ipChange.ipc$dispatch("f32d7bb5", new Object[]{this});
        }
        return Collections.unmodifiableSet(this.b.keySet()).iterator();
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.handshake.HandshakeBuilder
    public void put(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6fc7a2a", new Object[]{this, str, str2});
        } else {
            this.b.put(str, str2);
        }
    }

    @Override // com.alipay.android.phone.mobilesdk.socketcraft.handshake.HandshakeBuilder
    public void setContent(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9654c05", new Object[]{this, bArr});
        } else {
            this.f3757a = bArr;
        }
    }
}
