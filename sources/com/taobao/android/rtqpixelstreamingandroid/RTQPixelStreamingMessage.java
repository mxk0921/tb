package com.taobao.android.rtqpixelstreamingandroid;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class RTQPixelStreamingMessage {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f9322a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum MessageType {
        UIInteraction(50),
        TouchStart(80),
        TouchEnd(81),
        TouchMove(82),
        CloseMsg(200);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int value;

        MessageType(int i) {
            this.value = i;
        }

        public static /* synthetic */ Object ipc$super(MessageType messageType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/rtqpixelstreamingandroid/RTQPixelStreamingMessage$MessageType");
        }

        public static MessageType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MessageType) ipChange.ipc$dispatch("2e69ec9b", new Object[]{str});
            }
            return (MessageType) Enum.valueOf(MessageType.class, str);
        }

        public int getValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d1b766b5", new Object[]{this})).intValue();
            }
            return this.value;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int b = 0;

        /* renamed from: a  reason: collision with root package name */
        public int f9323a = 0;
        public float c = 0.0f;
        public Boolean d = Boolean.FALSE;
        public int e = 0;

        static {
            t2o.a(316669983);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return String.valueOf(this.e) + "-<" + String.valueOf(this.f9323a) + "," + String.valueOf(this.b) + ">";
        }
    }

    static {
        t2o.a(316669981);
    }

    public RTQPixelStreamingMessage(byte[] bArr) {
        this.f9322a = bArr;
    }

    public static RTQPixelStreamingMessage a(MessageType messageType, ArrayList<a> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RTQPixelStreamingMessage) ipChange.ipc$dispatch("a48ffdf4", new Object[]{messageType, arrayList});
        }
        byte[] bArr = new byte[(arrayList.size() * 7) + 2];
        bArr[0] = (byte) messageType.getValue();
        bArr[1] = (byte) arrayList.size();
        int i = 2;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            a aVar = arrayList.get(i2);
            short s = (short) aVar.f9323a;
            bArr[i] = (byte) (s & 255);
            bArr[i + 1] = (byte) ((s >> 8) & 255);
            short s2 = (short) aVar.b;
            bArr[i + 2] = (byte) (s2 & 255);
            bArr[i + 3] = (byte) ((s2 >> 8) & 255);
            bArr[i + 4] = (byte) aVar.e;
            bArr[i + 5] = (byte) (aVar.c * 255.0f);
            bArr[i + 6] = aVar.d.booleanValue() ? (byte) 1 : (byte) 0;
            i += 7;
        }
        return new RTQPixelStreamingMessage(bArr);
    }
}
