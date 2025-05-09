package com.alipay.mobile.common.amnet.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AmnetPost implements Parcelable {
    public static final Parcelable.Creator<AmnetPost> CREATOR = new Parcelable.Creator<AmnetPost>() { // from class: com.alipay.mobile.common.amnet.api.model.AmnetPost.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AmnetPost createFromParcel(Parcel parcel) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AmnetPost) ipChange.ipc$dispatch("b39803e4", new Object[]{this, parcel}) : new AmnetPost(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AmnetPost[] newArray(int i) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (AmnetPost[]) ipChange.ipc$dispatch("8387c4d", new Object[]{this, new Integer(i)}) : new AmnetPost[i];
        }
    };
    public static final String MMTP_EXT_FORWARD_IP = "mmtp_forward_ip";
    public byte[] body;
    public byte channel;
    public Map<String, String> header;
    public boolean important;
    public long ipcM2p;
    public boolean isUrgent;
    public boolean localAmnet;
    public boolean multiplex;
    public Map<String, String> params;
    public int reqSeqId;
    public boolean secret;
    public boolean toBizSys;
    public long ts;

    public void addParam(String str, String str2) {
        if (this.params == null) {
            this.params = new HashMap();
        }
        this.params.put(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void readFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        this.channel = parcel.readByte();
        HashMap hashMap = new HashMap();
        this.header = hashMap;
        parcel.readMap(hashMap, getClass().getClassLoader());
        byte[] bArr = new byte[parcel.readInt()];
        this.body = bArr;
        parcel.readByteArray(bArr);
        this.reqSeqId = parcel.readInt();
        boolean z4 = false;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.secret = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.important = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.toBizSys = z3;
        this.ts = parcel.readLong();
        this.ipcM2p = parcel.readLong();
        HashMap hashMap2 = new HashMap();
        this.params = hashMap2;
        parcel.readMap(hashMap2, getClass().getClassLoader());
        if (parcel.readByte() != 0) {
            z4 = true;
        }
        this.isUrgent = z4;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.channel);
        parcel.writeMap(this.header);
        parcel.writeInt(this.body.length);
        parcel.writeByteArray(this.body);
        parcel.writeInt(this.reqSeqId);
        parcel.writeByte(this.secret ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.important ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.toBizSys ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.ts);
        parcel.writeLong(this.ipcM2p);
        parcel.writeMap(this.params);
        parcel.writeByte(this.isUrgent ? (byte) 1 : (byte) 0);
    }

    public AmnetPost() {
        this.reqSeqId = -1;
        this.secret = false;
        this.important = false;
        this.toBizSys = true;
        this.ts = 0L;
        this.multiplex = false;
        this.localAmnet = false;
        this.isUrgent = false;
    }

    private AmnetPost(Parcel parcel) {
        this.reqSeqId = -1;
        this.secret = false;
        this.important = false;
        this.toBizSys = true;
        this.ts = 0L;
        this.multiplex = false;
        this.localAmnet = false;
        this.isUrgent = false;
        readFromParcel(parcel);
    }
}
