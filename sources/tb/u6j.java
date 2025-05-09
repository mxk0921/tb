package tb;

import android.os.RemoteException;
import android.text.TextUtils;
import anetwork.channel.aidl.ParcelableInputStream;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.compat.mtop.MtopReadTimeoutException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class u6j extends InputStream {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ParcelableInputStream f29181a;

    public u6j(ParcelableInputStream parcelableInputStream) {
        this.f29181a = parcelableInputStream;
    }

    public static /* synthetic */ Object ipc$super(u6j u6jVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/phenix/compat/mtop/MtopResponseInputStream");
    }

    public final boolean a(Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c608e235", new Object[]{this, exc})).booleanValue();
        }
        if (TextUtils.isEmpty(exc.getMessage()) || !exc.getMessage().contains("await timeout")) {
            return false;
        }
        return true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        try {
            this.f29181a.close();
        } catch (RemoteException e) {
            throw new IOException(e);
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cc382310", new Object[]{this})).intValue();
        }
        try {
            return this.f29181a.readByte();
        } catch (RemoteException e) {
            throw new IOException(e);
        } catch (RuntimeException e2) {
            if (a(e2)) {
                throw new MtopReadTimeoutException();
            }
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9ed24497", new Object[]{this, bArr})).intValue();
        }
        try {
            return this.f29181a.read(bArr);
        } catch (RemoteException e) {
            throw new IOException(e);
        } catch (RuntimeException e2) {
            if (a(e2)) {
                throw new MtopReadTimeoutException();
            }
            throw e2;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("33620bf7", new Object[]{this, bArr, new Integer(i), new Integer(i2)})).intValue();
        }
        try {
            return this.f29181a.readBytes(bArr, i, i2);
        } catch (RemoteException e) {
            throw new IOException(e);
        } catch (RuntimeException e2) {
            if (a(e2)) {
                throw new MtopReadTimeoutException();
            }
            throw e2;
        }
    }
}
