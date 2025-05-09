package tb;

import android.os.RemoteException;
import anetwork.channel.aidl.ParcelableInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class pql extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    public final ParcelableInputStream f26239a;

    public pql(ParcelableInputStream parcelableInputStream) {
        this.f26239a = parcelableInputStream;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        try {
            return this.f26239a.available();
        } catch (RemoteException e) {
            e.printStackTrace();
            throw new IOException("remote error");
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        try {
            this.f26239a.close();
        } catch (RemoteException e) {
            e.printStackTrace();
            throw new IOException("remote error");
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.f26239a.readByte();
        } catch (RemoteException e) {
            e.printStackTrace();
            throw new IOException("remote error");
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.f26239a.read(bArr);
        } catch (RemoteException e) {
            e.printStackTrace();
            throw new IOException("remote error");
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.f26239a.readBytes(bArr, i, i2);
        } catch (RemoteException e) {
            e.printStackTrace();
            throw new IOException("remote error");
        }
    }
}
