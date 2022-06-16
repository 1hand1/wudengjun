public void update(byte[] b, int off, int len) {

    if (b == null) {

        throw new NullPointerException();

    }

    if (off < 0 || len < 0 || off + len > b.length) {

        throw new ArrayIndexOutOfBoundsException();

}

    crc = updateBytes(crc, b, off, len);

}
String getValueName ( IValue valueObject ){

   if( valueObject.getType() == VALTYPE.IMME ) {

       return valueObject.getName();

    }

    return null;

}
