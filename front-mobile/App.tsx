import { StatusBar } from 'expo-status-bar';
import React from 'react';
import { StyleSheet, Text, View } from 'react-native';
import Header from './src/Header';

export default function App() {
  return (
    <View style={styles.container}>

<Header/>
      <StatusBar style="auto" />
      <Header/>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1
  },
});
