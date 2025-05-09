package com.alibaba.ariver.kernel.api.bytedata;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ByteArrayPools {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class ByteArray127Pool extends ByteArrayPool {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public ByteArray127Pool() {
            super();
        }

        public static /* synthetic */ Object ipc$super(ByteArray127Pool byteArray127Pool, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ariver/kernel/api/bytedata/ByteArrayPools$ByteArray127Pool");
        }

        @Override // com.alibaba.ariver.kernel.api.bytedata.Pool
        public byte[] newObject() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("cf055397", new Object[]{this}) : new byte[127];
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class ByteArray2Pool extends ByteArrayPool {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public ByteArray2Pool() {
            super();
        }

        public static /* synthetic */ Object ipc$super(ByteArray2Pool byteArray2Pool, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ariver/kernel/api/bytedata/ByteArrayPools$ByteArray2Pool");
        }

        @Override // com.alibaba.ariver.kernel.api.bytedata.Pool
        public byte[] newObject() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("cf055397", new Object[]{this}) : new byte[2];
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class ByteArray4Pool extends ByteArrayPool {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public ByteArray4Pool() {
            super();
        }

        public static /* synthetic */ Object ipc$super(ByteArray4Pool byteArray4Pool, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ariver/kernel/api/bytedata/ByteArrayPools$ByteArray4Pool");
        }

        @Override // com.alibaba.ariver.kernel.api.bytedata.Pool
        public byte[] newObject() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("cf055397", new Object[]{this}) : new byte[4];
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class ByteArray8Pool extends ByteArrayPool {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public ByteArray8Pool() {
            super();
        }

        public static /* synthetic */ Object ipc$super(ByteArray8Pool byteArray8Pool, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ariver/kernel/api/bytedata/ByteArrayPools$ByteArray8Pool");
        }

        @Override // com.alibaba.ariver.kernel.api.bytedata.Pool
        public byte[] newObject() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("cf055397", new Object[]{this}) : new byte[8];
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static abstract class ByteArrayPool extends Pool<byte[]> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ByteArrayPool byteArrayPool, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -710787569) {
                super.free((ByteArrayPool) objArr[0]);
                return null;
            } else if (hashCode == -232228346) {
                return super.obtain();
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/ariver/kernel/api/bytedata/ByteArrayPools$ByteArrayPool");
            }
        }

        public ByteArrayPool() {
            super(1, 8);
        }

        public synchronized void free(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("874588fa", new Object[]{this, bArr});
            } else {
                super.free((ByteArrayPool) bArr);
            }
        }

        @Override // com.alibaba.ariver.kernel.api.bytedata.Pool
        public synchronized byte[] obtain() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (byte[]) ipChange.ipc$dispatch("f598bb1", new Object[]{this});
            }
            return (byte[]) super.obtain();
        }
    }
}
